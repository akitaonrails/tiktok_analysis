package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0cVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014790cVx implements InterfaceC1014900cW8 {
    public final AnoleComponentModel LIZ;
    public final C1009340cNA LIZIZ;
    public InterfaceC1015000cWI LIZLLL;
    public C1014810cVz LJFF;
    public boolean LJI;
    public EnumC1014800cVy LIZJ = EnumC1014800cVy.INITIAL;
    public final List<C1014810cVz> LJ = new ArrayList();

    @Override // X.InterfaceC1014870cW5
    public final void LIZ() {
        if (!this.LJI) {
            LJ(EnumC1014800cVy.INITIAL);
        }
        LJ(EnumC1014800cVy.INITIAL);
        ((ArrayList) this.LJ).clear();
        this.LIZLLL = null;
        this.LJFF = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[resetState], hasLoadSuccess = ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", componentType = ");
        sbLIZ.append(this.LIZ.type);
        sbLIZ.append(", object = ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1014870cW5
    public final void n3() {
        if (this.LIZJ == EnumC1014800cVy.INITIAL) {
            C1015450cX1 c1015450cX1 = C1015450cX1.LIZ;
            String tag = this.LIZ.getTag();
            if (tag == null) {
                tag = "anole_ad";
            }
            String refer = this.LIZ.getRefer();
            if (refer == null) {
                refer = "";
            }
            AnoleComponentModel anoleComponentModel = this.LIZ;
            C1009340cNA c1009340cNA = this.LIZIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("render_strategy", this.LIZ.getRenderStrategy());
            linkedHashMap.put("prerender_failed_strategy", this.LIZ.prerenderFailedStrategy);
            c1015450cX1.getClass();
            C1015450cX1.LJIIJ("anole_component_render_skip", tag, refer, anoleComponentModel, c1009340cNA, linkedHashMap);
        }
    }

    @Override // X.InterfaceC1014870cW5
    public final void m3() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onComponentDidShow], componentType = ");
        sbLIZ.append(this.LIZ.type);
        sbLIZ.append(", object = ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        C1014810cVz c1014810cVz = this.LJFF;
        if (c1014810cVz != null) {
            if (c1014810cVz.LIZLLL == null || c1014810cVz.LJ == null) {
                onLoadSuccess(EnumC1014820cW0.FALLBACK.getValue());
            }
        }
    }

    @Override // X.InterfaceC1014870cW5
    public final void o3() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[startNowRender],, componentType = ");
        sbLIZ.append(this.LIZ.type);
        sbLIZ.append(", object = ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        LJ(EnumC1014800cVy.NOW_RENDERING);
    }

    @Override // X.InterfaceC1014870cW5
    public final void p3() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[startPrerender],, componentType = ");
        sbLIZ.append(this.LIZ.type);
        sbLIZ.append(", object = ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        LJ(EnumC1014800cVy.PRERENDERING);
    }

    @Override // X.InterfaceC1014900cW8
    public final List<C1014810cVz> LIZIZ() {
        return this.LJ;
    }

    public final void LIZLLL(EnumC1014780cVw enumC1014780cVw) {
        C1014810cVz c1014810cVz = new C1014810cVz(((ArrayList) this.LJ).size() + 1, enumC1014780cVw, System.currentTimeMillis(), null, null, null);
        this.LJFF = c1014810cVz;
        ((ArrayList) this.LJ).add(c1014810cVz);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[startRenderRecord] ");
        sbLIZ.append(c1014810cVz);
        sbLIZ.append(",componentType = ");
        sbLIZ.append(this.LIZ.type);
        sbLIZ.append(", object = ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r12 != X.EnumC1014800cVy.LOAD_SUCCESS) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        if (r12 != X.EnumC1014800cVy.LOAD_FAILED) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        if (r12 != X.EnumC1014800cVy.NOW_RENDERING) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
    
        if (r12 != X.EnumC1014800cVy.NOW_RENDERING) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.EnumC1014800cVy r12) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1014790cVx.LJ(X.0cVy):void");
    }

    @Override // X.InterfaceC1014870cW5
    public final void l3(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onComponentDidShowFail], failReason = ");
        sbLIZ.append(str);
        sbLIZ.append(", componentType = ");
        sbLIZ.append(this.LIZ.type);
        sbLIZ.append(", object = ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        C1014810cVz c1014810cVz = this.LJFF;
        if (c1014810cVz != null) {
            if (c1014810cVz.LIZLLL != null && c1014810cVz.LJ != null) {
                return;
            }
            k3(str, EnumC1014820cW0.FALLBACK.getValue());
        }
    }

    @Override // X.InterfaceC1014870cW5
    public final void onLoadSuccess(String str) {
        EnumC1014780cVw enumC1014780cVw;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onLoadSuccess], , triggerType = ");
        sbLIZ.append(str);
        sbLIZ.append(", componentType = ");
        sbLIZ.append(this.LIZ.type);
        sbLIZ.append(", object = ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        LJ(EnumC1014800cVy.LOAD_SUCCESS);
        LIZJ(null, true);
        InterfaceC1015000cWI interfaceC1015000cWI = this.LIZLLL;
        if (interfaceC1015000cWI != null) {
            C1014810cVz c1014810cVz = (C1014810cVz) C13LP.LJJLIIIJL(this.LJ);
            if (c1014810cVz == null || (enumC1014780cVw = c1014810cVz.LIZIZ) == null) {
                enumC1014780cVw = EnumC1014780cVw.UNKNOWN;
            }
            interfaceC1015000cWI.LIZIZ(true, null, enumC1014780cVw, str);
        }
        this.LJI = true;
    }

    public C1014790cVx(C1009340cNA c1009340cNA, AnoleComponentModel anoleComponentModel) {
        this.LIZ = anoleComponentModel;
        this.LIZIZ = c1009340cNA;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[init], current state = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", componentType = ");
        sbLIZ.append(anoleComponentModel.type);
        sbLIZ.append(", componentId = ");
        sbLIZ.append(anoleComponentModel.getID());
        sbLIZ.append(", object = ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZJ(String str, boolean z) {
        Long lValueOf;
        C1014810cVz c1014810cVz = this.LJFF;
        if (c1014810cVz != null) {
            c1014810cVz.LIZLLL = Long.valueOf(System.currentTimeMillis());
            c1014810cVz.LJ = Boolean.valueOf(z);
            c1014810cVz.LJFF = str;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[finishRenderRecord] ");
            sbLIZ.append(c1014810cVz);
            sbLIZ.append(", duration = ");
            Long l = c1014810cVz.LIZLLL;
            if (l != null) {
                lValueOf = Long.valueOf(l.longValue() - c1014810cVz.LIZJ);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(", componentType = ");
            sbLIZ.append(this.LIZ.type);
            sbLIZ.append(", object = ");
            sbLIZ.append(hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LJFF = null;
    }

    @Override // X.InterfaceC1014870cW5
    public final void k3(String str, String str2) {
        EnumC1014780cVw enumC1014780cVw;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onLoadFailed], failReason = ");
        sbLIZ.append(str);
        sbLIZ.append(", triggerType = ");
        sbLIZ.append(str2);
        sbLIZ.append(" componentType = ");
        sbLIZ.append(this.LIZ.type);
        sbLIZ.append(", object = ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        LJ(EnumC1014800cVy.LOAD_FAILED);
        LIZJ(str, false);
        InterfaceC1015000cWI interfaceC1015000cWI = this.LIZLLL;
        if (interfaceC1015000cWI != null) {
            C1014810cVz c1014810cVz = (C1014810cVz) C13LP.LJJLIIIJL(this.LJ);
            if (c1014810cVz == null || (enumC1014780cVw = c1014810cVz.LIZIZ) == null) {
                enumC1014780cVw = EnumC1014780cVw.UNKNOWN;
            }
            interfaceC1015000cWI.LIZIZ(false, str, enumC1014780cVw, str2);
        }
    }
}
