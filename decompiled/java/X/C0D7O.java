package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D7O, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7O implements ViewModelProvider.Factory {
    public final CheckoutIntent LIZ;
    public final CheckoutSession LIZIZ;
    public final C0D7U LIZJ;
    public final C332710D2n LIZLLL;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        int iIntValue;
        C0D7P c0d7p;
        Map<String, String> map;
        String str;
        Integer numLJIIJJI;
        if (cls.isAssignableFrom(CheckoutViewModel.class)) {
            C0D5B c0d5bLIZ = C0D59.LIZ(this.LIZ);
            CheckoutIntent checkoutIntent = this.LIZ;
            if (checkoutIntent != null && (map = checkoutIntent.passThrough) != null && (str = map.get("protocol_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                iIntValue = numLJIIJJI.intValue();
                if (iIntValue == 1) {
                    c0d7p = new C0D7P(new C0D79(), new InterfaceC333970D7j() { // from class: X.0D75
                        @Override // X.InterfaceC333970D7j
                        public final CheckoutSession LIZ(Object obj) {
                            return LJ(C0D7D.CREATE_CHECKOUT, obj);
                        }

                        @Override // X.InterfaceC333970D7j
                        public final CheckoutSession LIZIZ(Object obj) {
                            return LJ(C0D7D.COMPLETE_CHECKOUT, obj);
                        }

                        @Override // X.InterfaceC333970D7j
                        public final CheckoutSession LIZLLL(Object obj) {
                            return LJ(C0D7D.UPDATE_CHECKOUT, obj);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public static com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession LJ(X.C0D7D r33, java.lang.Object r34) {
                            /*
                                Method dump skipped, instruction units count: 481
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C0D75.LJ(X.0D7D, java.lang.Object):com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession");
                        }

                        @Override // X.InterfaceC333970D7j
                        public final C0D77 LIZJ(C0D7D c0d7d, Throwable th) {
                            String strLIZIZ;
                            C0D77 c0d77;
                            Throwable th2 = th;
                            C0D77 c0d772 = null;
                            if (th2 instanceof C0D77) {
                                c0d772 = (C0D77) th2;
                            }
                            String message = th2.getMessage();
                            if (message == null || (strLIZIZ = a0.LJLIIIL(message).toString()) == null || strLIZIZ.length() == 0 || strLIZIZ == null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(c0d7d.name());
                                sbLIZ.append(" failed");
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            }
                            if (c0d772 != null) {
                                EnumC334020D7o kind = c0d772.getKind();
                                Integer rpcCode = c0d772.getRpcCode();
                                String code = c0d772.getCode();
                                String path = c0d772.getPath();
                                Throwable cause = c0d772.getCause();
                                if (cause != null) {
                                    th2 = cause;
                                }
                                c0d77 = new C0D77(kind, rpcCode, code, strLIZIZ, path, th2);
                            } else {
                                c0d77 = new C0D77(EnumC334020D7o.UNKNOWN, null, null, strLIZIZ, null, th2);
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append('[');
                            sbLIZ2.append(c0d7d.name());
                            sbLIZ2.append("] ACP error kind=");
                            sbLIZ2.append(c0d77.getKind().name());
                            sbLIZ2.append(" code=");
                            String code2 = c0d77.getCode();
                            String str2 = "<none>";
                            if (code2 == null) {
                                code2 = "<none>";
                            }
                            sbLIZ2.append(code2);
                            sbLIZ2.append(" path=");
                            String path2 = c0d77.getPath();
                            if (path2 != null) {
                                str2 = path2;
                            }
                            sbLIZ2.append(str2);
                            sbLIZ2.append(" message=");
                            String message2 = c0d77.getMessage();
                            if (message2 == null) {
                                message2 = "";
                            }
                            sbLIZ2.append(message2);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            return c0d77;
                        }
                    });
                }
                return new CheckoutViewModel(this.LIZ, this.LIZIZ, new C0D7Z(iIntValue, c0d5bLIZ, c0d7p.LIZ, c0d7p.LIZIZ), this.LIZJ, this.LIZLLL);
            }
            iIntValue = 0;
            c0d7p = new C0D7P(new C0D7Y(), new InterfaceC333970D7j() { // from class: X.0D76
                @Override // X.InterfaceC333970D7j
                public final CheckoutSession LIZ(Object obj) {
                    return (CheckoutSession) obj;
                }

                @Override // X.InterfaceC333970D7j
                public final CheckoutSession LIZIZ(Object obj) {
                    return (CheckoutSession) obj;
                }

                @Override // X.InterfaceC333970D7j
                public final CheckoutSession LIZLLL(Object obj) {
                    return (CheckoutSession) obj;
                }

                @Override // X.InterfaceC333970D7j
                public final C0D77 LIZJ(C0D7D c0d7d, Throwable th) {
                    C0D77 c0d77;
                    C0D77 c0d772;
                    Throwable th2 = th;
                    String strLIZIZ = null;
                    if (th2 instanceof C0D77) {
                        c0d77 = (C0D77) th2;
                    } else {
                        c0d77 = null;
                    }
                    String message = th2.getMessage();
                    if (message != null) {
                        strLIZIZ = a0.LJLIIIL(message).toString();
                    }
                    String str2 = "";
                    if (strLIZIZ == null) {
                        strLIZIZ = "";
                    }
                    if (!(!a0.LJJJIL(strLIZIZ))) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c0d7d.name());
                        sbLIZ.append(" failed");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (c0d77 != null) {
                        EnumC334020D7o kind = c0d77.getKind();
                        String code = c0d77.getCode();
                        String path = c0d77.getPath();
                        Throwable cause = c0d77.getCause();
                        if (cause != null) {
                            th2 = cause;
                        }
                        c0d772 = new C0D77(kind, null, code, strLIZIZ, path, th2);
                    } else {
                        c0d772 = new C0D77(EnumC334020D7o.UNKNOWN, null, null, strLIZIZ, null, th2);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('[');
                    sbLIZ2.append(c0d7d.name());
                    sbLIZ2.append("] error kind=");
                    sbLIZ2.append(c0d772.getKind().name());
                    sbLIZ2.append(" code=");
                    String code2 = c0d772.getCode();
                    String str3 = "<none>";
                    if (code2 == null) {
                        code2 = "<none>";
                    }
                    sbLIZ2.append(code2);
                    sbLIZ2.append(" path=");
                    String path2 = c0d772.getPath();
                    if (path2 != null) {
                        str3 = path2;
                    }
                    sbLIZ2.append(str3);
                    sbLIZ2.append(" message=");
                    String message2 = c0d772.getMessage();
                    if (message2 != null) {
                        str2 = message2;
                    }
                    sbLIZ2.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return c0d772;
                }
            });
            return new CheckoutViewModel(this.LIZ, this.LIZIZ, new C0D7Z(iIntValue, c0d5bLIZ, c0d7p.LIZ, c0d7p.LIZIZ), this.LIZJ, this.LIZLLL);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }

    public C0D7O(CheckoutIntent checkoutIntent, CheckoutSession checkoutSession, C0D7U c0d7u, C332710D2n c332710D2n) {
        this.LIZ = checkoutIntent;
        this.LIZIZ = checkoutSession;
        this.LIZJ = c0d7u;
        this.LIZLLL = c332710D2n;
    }
}
