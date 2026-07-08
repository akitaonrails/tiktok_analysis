package X;

import Y.ARunnableS120S0100000_20;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.mapbuffer.ReadableMapBuffer;
import com.lynx.tasm.behavior.LayoutContext;
import com.lynx.tasm.behavior.LayoutNodeManager;
import com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.PropBundle;
import j27.s;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311770kEx extends LayoutContext {
    public final s LIZLLL;
    public final InterfaceC1310560kD0 LJ;
    public final C1289430jev LJFF;
    public final C1311780kEy LJI = new C1311780kEy();
    public final LayoutNodeManager LJII = new LayoutNodeManager();

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void scheduleLayout() {
        if (this.LIZIZ) {
            return;
        }
        this.LJ.LIZ(new ARunnableS120S0100000_20(this, 212));
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void detachNativePtr() {
        SparseArray<ShadowNode> sparseArray;
        super.detachNativePtr();
        C1311780kEy c1311780kEy = this.LJI;
        if (c1311780kEy == null || (sparseArray = c1311780kEy.LIZ) == null || sparseArray.size() <= 0) {
            return;
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            ShadowNode shadowNodeValueAt = sparseArray.valueAt(i);
            shadowNodeValueAt.LJIILJJIL = true;
            shadowNodeValueAt.LJIJI();
            shadowNodeValueAt.LIZ = null;
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void attachLayoutNodeManager(long j) {
        this.LJII.LIZ = j;
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void destroyNodes(int[] iArr) {
        for (int i : iArr) {
            C1311780kEy c1311780kEy = this.LJI;
            ShadowNode shadowNode = c1311780kEy.LIZ.get(i);
            c1311780kEy.LIZ.remove(i);
            if (shadowNode != null) {
                shadowNode.LJIILJJIL = true;
                shadowNode.LJIJI();
                shadowNode.LIZ = null;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void dispatchOnLayoutBefore(int i) {
        this.LJI.LIZ(i).LJFF();
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final Object getExtraBundle(int i) {
        ShadowNode shadowNodeLIZ = this.LJI.LIZ(i);
        if (shadowNodeLIZ == null) {
            return null;
        }
        return shadowNodeLIZ.LJIIL();
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void setFontFaces(ReadableMap readableMap) {
        s sVar = this.LIZLLL;
        ReadableMap map = readableMap.getMap("fontfaces");
        if (map == null) {
            sVar.getClass();
            return;
        }
        synchronized (sVar.LLILZLL) {
            try {
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    ReadableMap map2 = map.getMap(strNextKey);
                    if (map2 != null) {
                        ((HashMap) sVar.LLILZLL).put(strNextKey, map2);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1311770kEx(s sVar, C1289430jev c1289430jev, InterfaceC1310560kD0 interfaceC1310560kD0) {
        this.LIZLLL = sVar;
        this.LJFF = c1289430jev;
        this.LJ = interfaceC1310560kD0;
        LIZ(this);
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void insertNode(int i, int i2, int i3) {
        ShadowNode shadowNodeLIZ = this.LJI.LIZ(i);
        ShadowNode shadowNodeLIZ2 = this.LJI.LIZ(i2);
        if (i3 == -1) {
            i3 = shadowNodeLIZ.LJIIJ();
        }
        try {
            shadowNodeLIZ.LJIIIIZZ(shadowNodeLIZ2, i3);
        } catch (ArrayIndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Add child out of bounds, parentSignature: ");
            sbLIZ.append(i);
            sbLIZ.append(", index: ");
            sbLIZ.append(i3);
            sbLIZ.append(", childSignature: ");
            sbLIZ.append(i2);
            LynxLog.w("ShadowNodeOwner", C2188811AlT.LIZIZ(sbLIZ));
        }
        shadowNodeLIZ.LJIILLIIL();
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void removeNode(int i, int i2, int i3) {
        ShadowNode shadowNodeLIZ = this.LJI.LIZ(i);
        if (shadowNodeLIZ == null) {
            return;
        }
        try {
            ArrayList<ShadowNode> arrayList = shadowNodeLIZ.LJIIJ;
            if (arrayList != null) {
                ((ShadowNode) ListProtector.remove(arrayList, i3)).LJIIJJI = null;
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Index ");
            sbLIZ.append(i3);
            sbLIZ.append(" out of bounds: node has no children");
            throw new ArrayIndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
        } catch (ArrayIndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Remove child out of bounds, parentSignature: ");
            sbLIZ2.append(i);
            sbLIZ2.append(", index: ");
            sbLIZ2.append(i3);
            sbLIZ2.append(", childSignature: ");
            sbLIZ2.append(i2);
            LynxLog.w("ShadowNodeOwner", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void updateProps(int i, PropBundle propBundle, ReadableMapBuffer readableMapBuffer) {
        ReadableMap props;
        ReadableArray eventHandlers = null;
        if (propBundle != null) {
            props = propBundle.getProps();
            eventHandlers = propBundle.getEventHandlers();
        } else {
            props = null;
        }
        ShadowNode shadowNodeLIZ = this.LJI.LIZ(i);
        if (shadowNodeLIZ != null) {
            if (props != null) {
                shadowNodeLIZ.LJJII(new C1311730kEt(props, readableMapBuffer));
            }
            if (eventHandlers != null) {
                shadowNodeLIZ.LJIL(C1299120juY.LIZ(eventHandlers));
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Trying to update non-existent view with tag ");
        sbLIZ.append(i);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final int createNode(int i, String str, PropBundle propBundle, ReadableMapBuffer readableMapBuffer, boolean z) {
        ReadableMap props;
        int i2;
        ReadableArray eventHandlers = null;
        if (propBundle != null) {
            props = propBundle.getProps();
            eventHandlers = propBundle.getEventHandlers();
        } else {
            props = null;
        }
        ShadowNode shadowNodeLJ = this.LJFF.LIZIZ(str).LJ();
        if (shadowNodeLJ != null) {
            i2 = 4;
        } else {
            i2 = 1;
            if (!z) {
                return 1;
            }
            shadowNodeLJ = new NativeLayoutNodeRef();
        }
        shadowNodeLJ.LIZIZ = i;
        shadowNodeLJ.LJIIIZ = str;
        shadowNodeLJ.LJIJJLI(this.LIZLLL);
        shadowNodeLJ.LIZ = this.LJII;
        shadowNodeLJ.LJIL(C1299120juY.LIZ(eventHandlers));
        this.LJI.LIZ.put(shadowNodeLJ.LIZIZ, shadowNodeLJ);
        if (props != null) {
            shadowNodeLJ.LJJII(new C1311730kEt(props, readableMapBuffer));
        }
        if (!this.LIZIZ) {
            shadowNodeLJ.LJ();
        }
        if (shadowNodeLJ.LJIILL()) {
            i2 |= 2;
        }
        if (z && shadowNodeLJ.LJJI()) {
            return i2 | 32;
        }
        return i2;
    }

    @Override // com.lynx.tasm.behavior.LayoutContext
    public final void dispatchOnLayout(int i, int i2, int i3, int i4, int i5) {
        this.LJI.LIZ(i).LJ = false;
    }
}
