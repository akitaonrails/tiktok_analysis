package X;

import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BUP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BUP extends AbstractC1045430dJN {
    public final C1046930dLn LIZ;
    public final C1045760dJu LIZIZ;
    public final C1BUY LIZJ;
    public C21689919ub LIZLLL;
    public C1BUI LJ;
    public boolean LJFF;
    public boolean LJI;
    public final String LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    @Override // X.AbstractC1045430dJN
    public final void LIZJ() {
        if (this.LJI) {
            return;
        }
        this.LIZLLL.clear();
        LJ();
        this.LJI = true;
        C1BUI c1bui = this.LJ;
        c1bui.getClass();
        C1287860jcO.LIZ.LIZ(c1bui.LJI(), "finishSession", c1bui.LIZ);
        C21690119ud c21690119ud = C21690119ud.LIZJ;
        boolean z = c21690119ud.LIZIZ.size() > 0;
        c21690119ud.LIZ.remove(this);
        c21690119ud.LIZIZ.remove(this);
        if (z && c21690119ud.LIZIZ.size() <= 0) {
            C1BUX c1buxLIZ = C1BUX.LIZ();
            c1buxLIZ.getClass();
            final C2205621BUa c2205621BUa = C2205621BUa.LJII;
            c2205621BUa.getClass();
            BPEAHandler bPEAHandler = C2205621BUa.LJIIIZ;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacks(C2205621BUa.LJIIJJI);
                C2205621BUa.LJIIIZ = null;
            }
            ((ArrayList) c2205621BUa.LIZ).clear();
            C786410Ut5.LJJZZIII(C2205621BUa.LJIIIIZZ, new Runnable() { // from class: X.1BUb
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TreeWalker@5ef9.j$1");
                    try {
                        C2205721BUk c2205721BUk = c2205621BUa.LJFF;
                        C2205681BUg c2205681BUg = c2205721BUk.LIZIZ;
                        AsyncTaskC2205701BUi asyncTaskC2205701BUi = new AsyncTaskC2205701BUi(c2205721BUk);
                        c2205681BUg.getClass();
                        asyncTaskC2205701BUi.LIZ = c2205681BUg;
                        c2205681BUg.LIZIZ.add(asyncTaskC2205701BUi);
                        if (c2205681BUg.LIZJ == null) {
                            AbstractAsyncTaskC2205651BUd abstractAsyncTaskC2205651BUdPoll = c2205681BUg.LIZIZ.poll();
                            c2205681BUg.LIZJ = abstractAsyncTaskC2205651BUdPoll;
                            if (abstractAsyncTaskC2205651BUdPoll != null) {
                                C0WP3.LIZLLL(abstractAsyncTaskC2205651BUdPoll, c2205681BUg.LIZ, new Object[0]);
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TreeWalker@5ef9.j$1");
                }
            });
            C1BUS c1bus = C1BUS.LLILZ;
            c1bus.LL = false;
            c1bus.LLILLL = null;
            C1BUR c1bur = c1buxLIZ.LIZLLL;
            c1bur.LIZ.getContentResolver().unregisterContentObserver(c1bur);
        }
        this.LJ.LJFF();
        this.LJ = null;
    }

    @Override // X.AbstractC1045430dJN
    public final void LJ() {
        if (this.LJI) {
            return;
        }
        ((ArrayList) this.LIZJ.LIZ).clear();
    }

    @Override // X.AbstractC1045430dJN
    public final void LJI() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        C21690119ud c21690119ud = C21690119ud.LIZJ;
        boolean z = c21690119ud.LIZIZ.size() > 0;
        c21690119ud.LIZIZ.add(this);
        if (!z) {
            C1BUX c1buxLIZ = C1BUX.LIZ();
            c1buxLIZ.getClass();
            C1BUS c1bus = C1BUS.LLILZ;
            c1bus.LLILLL = c1buxLIZ;
            c1bus.LL = true;
            boolean zLIZ = c1bus.LIZ();
            c1bus.LLILLJJLI = zLIZ;
            c1bus.LIZJ(zLIZ);
            C2205621BUa.LJII.getClass();
            C2205621BUa.LIZIZ();
            C1BUR c1bur = c1buxLIZ.LIZLLL;
            c1bur.LJ = c1bur.LIZ();
            c1bur.LIZIZ();
            c1bur.LIZ.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c1bur);
        }
        float f = C1BUX.LIZ().LIZ;
        C1BUI c1bui = this.LJ;
        c1bui.getClass();
        C1287860jcO.LIZ.LIZ(c1bui.LJI(), "setDeviceVolume", Float.valueOf(f), c1bui.LIZ);
        C1BUI c1bui2 = this.LJ;
        Date date = C1BUU.LJFF.LIZIZ;
        c1bui2.LIZIZ(date != null ? (Date) date.clone() : null);
        this.LJ.LIZJ(this, this.LIZ);
    }

    @Override // X.AbstractC1045430dJN
    public final void LIZLLL(View view) {
        if (this.LJI) {
            return;
        }
        C1045780dJw.LIZ(view, "AdView is null");
        if (this.LIZLLL.get() == view) {
            return;
        }
        this.LIZLLL = new C21689919ub(view);
        this.LJ.LJ();
        Collection<C1BUP> collectionUnmodifiableCollection = Collections.unmodifiableCollection(C21690119ud.LIZJ.LIZ);
        if (collectionUnmodifiableCollection != null && !collectionUnmodifiableCollection.isEmpty()) {
            for (C1BUP c1bup : collectionUnmodifiableCollection) {
                if (c1bup != this && c1bup.LIZLLL.get() == view) {
                    c1bup.LIZLLL.clear();
                }
            }
        }
    }

    @Override // X.AbstractC1045430dJN
    public final void LJFF(View view) {
        if (this.LJI) {
            return;
        }
        C1BUY c1buy = this.LIZJ;
        c1buy.getClass();
        if (view != null) {
            C2205711BUj c2205711BUjLIZ = c1buy.LIZ(view);
            if (c2205711BUjLIZ != null) {
                ((ArrayList) c1buy.LIZ).remove(c2205711BUjLIZ);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C1BUP(C1045760dJu c1045760dJu, C1046930dLn c1046930dLn) {
        C1BUI c1buh;
        final String string = UUID.randomUUID().toString();
        this.LIZJ = new C1BUY();
        this.LJFF = false;
        this.LJI = false;
        this.LIZIZ = c1045760dJu;
        this.LIZ = c1046930dLn;
        this.LJII = string;
        this.LIZLLL = new C21689919ub(null);
        EnumC1046920dLm enumC1046920dLm = c1046930dLn.LJII;
        if (enumC1046920dLm != EnumC1046920dLm.HTML && enumC1046920dLm != EnumC1046920dLm.JAVASCRIPT) {
            c1buh = new C1BUH(string, Collections.unmodifiableMap(c1046930dLn.LIZLLL), c1046930dLn.LJ);
        } else {
            final WebView webView = c1046930dLn.LIZIZ;
            c1buh = new C1BUI(webView, string) { // from class: X.1BUM
                {
                    super(string);
                    if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                        webView.getSettings().setJavaScriptEnabled(true);
                    }
                    this.LIZIZ = new C1BUN(webView);
                }
            };
        }
        this.LJ = c1buh;
        c1buh.LJII();
        C21690119ud.LIZJ.LIZ.add(this);
        C1BUI c1bui = this.LJ;
        c1bui.getClass();
        C1287860jcO c1287860jcO = C1287860jcO.LIZ;
        WebView webViewLJI = c1bui.LJI();
        String str = c1bui.LIZ;
        JSONObject jSONObject = new JSONObject();
        C1287890jcR.LIZIZ(jSONObject, "impressionOwner", c1045760dJu.LIZ);
        C1287890jcR.LIZIZ(jSONObject, "mediaEventsOwner", c1045760dJu.LIZIZ);
        C1287890jcR.LIZIZ(jSONObject, "creativeType", c1045760dJu.LIZLLL);
        C1287890jcR.LIZIZ(jSONObject, "impressionType", c1045760dJu.LJ);
        C1287890jcR.LIZIZ(jSONObject, "isolateVerificationScripts", Boolean.valueOf(c1045760dJu.LIZJ));
        c1287860jcO.LIZ(webViewLJI, "init", jSONObject, str);
    }

    @Override // X.AbstractC1045430dJN
    public final void LIZ(View view, EnumC1045490dJT enumC1045490dJT) {
        if (this.LJI) {
            return;
        }
        C1BUY c1buy = this.LIZJ;
        c1buy.getClass();
        if (view != null) {
            if (c1buy.LIZ(view) == null) {
                ((ArrayList) c1buy.LIZ).add(new C2205711BUj(view, enumC1045490dJT));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }
}
