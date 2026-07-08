package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.io.InputStream;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532500pyy implements InterfaceC1530870pwL {
    public static final C1532500pyy LIZ = new C1532500pyy();
    public static final Uri LIZIZ = new Uri.Builder().build();

    @Override // X.InterfaceC1530870pwL
    public final InterfaceC1532430pyr LIZ(C08AB c08ab, C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR) {
        final InterfaceC1533080pzu interfaceC1533080pzu;
        C1530150pvB c1530150pvB;
        C1530540pvo c1530540pvo;
        String str = c1532710pzJ.LJIIL;
        if (str != null) {
            C1537480q70.Companion.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529830puf.LIZIZ(str);
            if (c1537480q70LIZIZ != null && (interfaceC1533080pzu = (InterfaceC1533080pzu) c1537480q70LIZIZ.LJFF(InterfaceC1533080pzu.class)) != null) {
                Object objLJFF = interfaceC1533080pzu.LJFF();
                if ((objLJFF instanceof C1530150pvB) && (c1530150pvB = (C1530150pvB) objLJFF) != null && (c1530540pvo = c1530150pvB.LIZJ) != null) {
                    c1530540pvo.LIZJ(c1532710pzJ.LJJIII.LIZ);
                }
                Uri uriLIZLLL = c1532710pzJ.LJJIII.LIZLLL();
                if (uriLIZLLL == null) {
                    uriLIZLLL = LIZIZ;
                }
                if (!interfaceC1533080pzu.LIZLLL(uriLIZLLL)) {
                    return null;
                }
                return new InterfaceC1532430pyr(interfaceC1533080pzu) { // from class: X.0pyx
                    public final InterfaceC1533080pzu LIZ;

                    @Override // X.InterfaceC1532520pz0
                    public final boolean LIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1532430pyr
                    public final boolean LIZJ(C1532300pye c1532300pye) {
                        return true;
                    }

                    @Override // X.InterfaceC1532520pz0
                    public final boolean LJFF() {
                        return true;
                    }

                    @Override // X.InterfaceC1532520pz0
                    public final String getName() {
                        return "pia";
                    }

                    @Override // X.InterfaceC1532520pz0
                    public final EnumC1528520psY LIZLLL() {
                        return EnumC1528520psY.WAIT_FOR_RESULT;
                    }

                    {
                        this.LIZ = interfaceC1533080pzu;
                    }

                    @Override // X.InterfaceC1532520pz0
                    public final void LJ(Function1 function1, Object obj) {
                        C1532460pyu.LIZ(this, (C1532550pz3) obj, function1);
                    }

                    @Override // X.InterfaceC1532430pyr
                    public final void LIZIZ(C08AB c08ab2, final C1532710pzJ c1532710pzJ2, C1532470pyv c1532470pyv2, C1532170pyR c1532170pyR2, Function1<? super C1532340pyi, Unit> function1) {
                        boolean z;
                        InterfaceC1532650pzD interfaceC1532650pzDLJI = this.LIZ.LJI(new InterfaceC1535470q3l() { // from class: X.0pyz
                            @Override // X.InterfaceC1535470q3l
                            public final /* synthetic */ Map getRequestHeaders() {
                                return null;
                            }

                            @Override // X.InterfaceC1535470q3l
                            public final Uri getUrl() {
                                Uri uriLIZLLL2 = c1532710pzJ2.LJJIII.LIZLLL();
                                return uriLIZLLL2 == null ? C1532500pyy.LIZIZ : uriLIZLLL2;
                            }

                            @Override // X.InterfaceC1535470q3l
                            public final boolean isForMainFrame() {
                                WebResourceRequest webResourceRequest;
                                Map<String, Object> map = c1532710pzJ2.LJ;
                                Object obj = map != null ? map.get("WEB_RESOURCE_REQUEST") : null;
                                if (!(obj instanceof WebResourceRequest) || (webResourceRequest = (WebResourceRequest) obj) == null) {
                                    return false;
                                }
                                return webResourceRequest.isForMainFrame();
                            }
                        });
                        C1531000pwY c1531000pwY = null;
                        if (interfaceC1532650pzDLJI == null) {
                            function1.invoke(null);
                            return;
                        }
                        String str2 = interfaceC1532650pzDLJI.getHeaders().get("pia_forest_from");
                        if (str2 == null) {
                            str2 = "pia";
                        }
                        c1532170pyR2.LIZIZ = str2;
                        if (interfaceC1532650pzDLJI.LIZJ() == EnumC1535440q3i.Offline) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c1532170pyR2.LIZJ = z;
                        c1532170pyR2.LJFF = interfaceC1532650pzDLJI.LIZIZ();
                        c1532170pyR2.LJ = interfaceC1532650pzDLJI.getMimeType();
                        InputStream data = interfaceC1532650pzDLJI.getData();
                        if (data != null) {
                            c1531000pwY = new C1531000pwY(data, null);
                        }
                        function1.invoke(new C1532340pyi(c1531000pwY, new C1530890pwN(null, null, null, null, interfaceC1532650pzDLJI.getHeaders(), 15)));
                    }
                };
            }
        }
        return null;
    }
}
