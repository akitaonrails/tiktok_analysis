package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18u8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21432218u8 {
    public final Context LIZ;
    public final List<InterfaceC21434318uT> LIZIZ = new ArrayList(3);
    public final TextView.BufferType LIZJ = TextView.BufferType.SPANNABLE;
    public final boolean LIZLLL = true;

    /* JADX WARN: Type inference failed for: r0v28, types: [X.0Hj0] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.18wV] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.0Hj3] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.18wN] */
    public final C21432418uA LIZ() {
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<InterfaceC21434318uT> list = this.LIZIZ;
        C13A4 c13a4 = new C13A4(list);
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            c13a4.LIZ((InterfaceC21434318uT) it2.next());
        }
        List<InterfaceC21434318uT> list2 = c13a4.LIZIZ;
        C21433918uP c21433918uP = new C21433918uP();
        final float f = this.LIZ.getResources().getDisplayMetrics().density;
        ?? r5 = new Object(f) { // from class: X.18wN
            public final float LIZ;

            {
                this.LIZ = f;
            }

            public final int LIZ(int i) {
                return (int) ((i * this.LIZ) + 0.5f);
            }
        };
        C448870Hiv c448870Hiv = new C448870Hiv();
        c448870Hiv.LJIILJJIL = r5.LIZ(8);
        c448870Hiv.LIZJ = r5.LIZ(24);
        c448870Hiv.LIZLLL = r5.LIZ(4);
        c448870Hiv.LJIIIIZZ = r5.LIZ(1);
        c448870Hiv.LJIILLIIL = r5.LIZ(1);
        c448870Hiv.LJIJ = r5.LIZ(4);
        C21434618uW c21434618uW = new C21434618uW();
        C21427518tN c21427518tN = new C21427518tN();
        C21435318ud c21435318ud = new C21435318ud();
        ArrayList<InterfaceC21434318uT> arrayList = (ArrayList) list2;
        for (InterfaceC21434318uT interfaceC21434318uT : arrayList) {
            interfaceC21434318uT.LIZJ(c21433918uP);
            interfaceC21434318uT.LJI(c448870Hiv);
            interfaceC21434318uT.LJIIJ(c21434618uW);
            interfaceC21434318uT.LIZLLL(c21427518tN);
            interfaceC21434318uT.LJ(c21435318ud);
        }
        C448860Hiu c448860Hiu = new C448860Hiu(c448870Hiv);
        C21435218uc c21435218uc = new C21435218uc(Collections.unmodifiableMap(c21435318ud.LIZ));
        c21434618uW.LIZ = c448860Hiu;
        c21434618uW.LJII = c21435218uc;
        if (c21434618uW.LIZIZ == null) {
            c21434618uW.LIZIZ = new AbstractC448900Hiy() { // from class: X.0Hj3
                @Override // X.AbstractC448900Hiy
                public final void LIZ(C448890Hix c448890Hix) {
                }

                @Override // X.AbstractC448900Hiy
                public final void LIZIZ(C448890Hix c448890Hix) {
                }

                @Override // X.AbstractC448900Hiy
                public final void LIZJ() {
                }
            };
        }
        if (c21434618uW.LIZJ == null) {
            c21434618uW.LIZJ = new InterfaceC21428318tV() { // from class: X.18wR
                @Override // X.InterfaceC21428318tV
                public final CharSequence LIZ(String str, String str2) {
                    return str2;
                }
            };
        }
        if (c21434618uW.LIZLLL == null) {
            c21434618uW.LIZLLL = new InterfaceC445270Hd7() { // from class: X.09dW
                @Override // X.InterfaceC445270Hd7
                public final void LIZ(View view, String str) {
                    Uri uriBuild = UriProtector.parse(str);
                    if (TextUtils.isEmpty(uriBuild.getScheme())) {
                        uriBuild = uriBuild.buildUpon().scheme("https").build();
                    }
                    Context context = view.getContext();
                    Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
                    intent.putExtra("com.android.browser.application_id", context.getPackageName());
                    try {
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent, context);
                        C2204961BRm.LJJJJJL(context, intent, new C0WZX("fTAwUg0uVs/PG1ogVxmTaVps6kxXTu5j7dF9rj1PE+LW", null));
                    } catch (ActivityNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            };
        }
        if (c21434618uW.LJFF == null) {
            c21434618uW.LJFF = new AbstractC21447018wW() { // from class: X.18wV
            };
        }
        if (c21434618uW.LJI == null) {
            c21434618uW.LJI = new AbstractC448910Hiz() { // from class: X.0Hj0
                @Override // X.AbstractC448910Hiz
                public final Rect LIZ(C448890Hix c448890Hix) {
                    int iLIZIZ;
                    int iLIZIZ2;
                    C448940Hj2 c448940Hj2 = c448890Hix.LIZJ;
                    Rect bounds = c448890Hix.LJ.getBounds();
                    int i = c448890Hix.LJI;
                    float f2 = c448890Hix.LJII;
                    if (c448940Hj2 == null) {
                        int iWidth = bounds.width();
                        if (iWidth > i) {
                            return new Rect(0, 0, i, (int) ((bounds.height() / (iWidth / i)) + 0.5f));
                        }
                    } else {
                        C448930Hj1 c448930Hj1 = c448940Hj2.LIZ;
                        C448930Hj1 c448930Hj12 = c448940Hj2.LIZIZ;
                        float fWidth = bounds.width() / bounds.height();
                        if (c448930Hj1 != null) {
                            if ("%".equals(c448930Hj1.LIZIZ)) {
                                iLIZIZ = (int) ((i * (c448930Hj1.LIZ / 100.0f)) + 0.5f);
                            } else {
                                iLIZIZ = LIZIZ(c448930Hj1, f2);
                            }
                            if (c448930Hj12 != null && !"%".equals(c448930Hj12.LIZIZ)) {
                                iLIZIZ2 = LIZIZ(c448930Hj12, f2);
                            } else {
                                iLIZIZ2 = (int) ((iLIZIZ / fWidth) + 0.5f);
                            }
                            return new Rect(0, 0, iLIZIZ, iLIZIZ2);
                        }
                        if (c448930Hj12 != null && !"%".equals(c448930Hj12.LIZIZ)) {
                            int iLIZIZ3 = LIZIZ(c448930Hj12, f2);
                            return new Rect(0, 0, (int) ((iLIZIZ3 * fWidth) + 0.5f), iLIZIZ3);
                        }
                    }
                    return bounds;
                }

                public static int LIZIZ(C448930Hj1 c448930Hj1, float f2) {
                    float f3;
                    if ("em".equals(c448930Hj1.LIZIZ)) {
                        f3 = c448930Hj1.LIZ * f2;
                    } else {
                        f3 = c448930Hj1.LIZ;
                    }
                    return (int) (f3 + 0.5f);
                }
            };
        }
        return new C21432418uA(this.LIZJ, new C21433218uI(c21433918uP), new C21436818us(c21427518tN, new C21432118u7(c21434618uW)), Collections.unmodifiableList(arrayList), this.LIZLLL);
    }

    public C21432218u8(Context context) {
        this.LIZ = context;
    }

    public final C21432218u8 LIZIZ(AbstractC21425218t0 abstractC21425218t0) {
        ((ArrayList) this.LIZIZ).add(abstractC21425218t0);
        return this;
    }
}
