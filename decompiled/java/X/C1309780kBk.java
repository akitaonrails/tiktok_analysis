package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.base.TraceEvent;
import j27.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0kBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309780kBk extends LynxViewClient {
    public final CopyOnWriteArrayList<LynxViewClient> LL = new CopyOnWriteArrayList<>();

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJII();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIIIZZ() {
        TraceEvent.LIZIZ("Client.onDestory");
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ();
        }
        TraceEvent.LJII("Client.onDestory");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ() {
        TraceEvent.LIZIZ("Client.onFirstScreen");
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJ();
        }
        TraceEvent.LJII("Client.onFirstScreen");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL() {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILJJIL();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILLIIL() {
        TraceEvent.LIZIZ("Client.onLynxViewAndJSRuntimeDestroy");
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILLIIL();
        }
        TraceEvent.LJII("Client.onLynxViewAndJSRuntimeDestroy");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ() {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIJ();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIFFI() {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIFFI();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJ() {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIJ();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZI() {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIZI();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC1294040jmM
    public final String LIZIZ(String str) {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            String strLIZIZ = it2.next().LIZIZ(str);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return null;
    }

    @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
    public final void LJFF(LynxError lynxError) {
        if (lynxError != null && lynxError.LIZJ() != null) {
            Iterator<LynxViewClient> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF(lynxError);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(Map<String, Object> map) {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJI(map);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIIZ(HashMap<String, Object> map) {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ(map);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI(C1318050kP5 c1318050kP5) {
        TraceEvent.LIZLLL("Client.onFling");
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJJI(c1318050kP5);
        }
        TraceEvent.LJII("Client.onFling");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIL(JavaOnlyMap javaOnlyMap) {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIL(javaOnlyMap);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILIIL(String str) {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILIIL(str);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(C1299240juk c1299240juk) {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILL(c1299240juk);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIZILJ(String str) {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIZILJ(str);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJI(Map<String, Object> map) {
        TraceEvent.LIZIZ("Client.onPiperInvoked");
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIJI(map);
        }
        TraceEvent.LJII("Client.onPiperInvoked");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJJ(String str) {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIJJ(str);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJJLI(LynxError lynxError) {
        if (lynxError != null && lynxError.LIZJ() != null) {
            Iterator<LynxViewClient> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                it2.next().LJIJJLI(lynxError);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIL(LynxError lynxError) {
        if (lynxError != null && lynxError.LIZJ() != null) {
            Iterator<LynxViewClient> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                it2.next().LJIL(lynxError);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJ(LynxError lynxError) {
        if (lynxError != null && lynxError.LIZJ() != null) {
            Iterator<LynxViewClient> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                it2.next().LJJ(lynxError);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJI(Set<String> set) {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJI(set);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJII(C1318050kP5 c1318050kP5) {
        TraceEvent.LIZLLL("Client.onScrollStart");
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJII(c1318050kP5);
        }
        TraceEvent.LJII("Client.onScrollStart");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIII(C1318050kP5 c1318050kP5) {
        TraceEvent.LIZLLL("Client.onScrollStop");
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIII(c1318050kP5);
        }
        TraceEvent.LJII("Client.onScrollStop");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJZLJL(TemplateBundle templateBundle) {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIJZLJL(templateBundle);
        }
    }

    public final void LJJIJ(LynxViewClient lynxViewClient) {
        if (!this.LL.contains(lynxViewClient)) {
            this.LL.add(lynxViewClient);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(Map<String, Object> map) {
        TraceEvent.LIZIZ("Client.onTimingSetup");
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onTimingSetup(map);
        }
        TraceEvent.LJII("Client.onTimingSetup");
    }

    @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
    public final void LJ(String str, String str2, int i) {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(str, str2, i);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(String str, Map map, Map map2) {
        TraceEvent.LIZLLL("Client.onTimingUpdate");
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIZ(str, map, map2);
        }
        TraceEvent.LJII("Client.onTimingUpdate");
    }

    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC1294040jmM
    public final void LIZJ(s sVar, String str, float f, float f2, C1316330kMJ c1316330kMJ) {
        Iterator<LynxViewClient> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(sVar, str, f, f2, c1316330kMJ);
        }
    }
}
