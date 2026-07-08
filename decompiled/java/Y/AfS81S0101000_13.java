package Y;

import X.C09JN;
import X.C0XQ3;
import X.C0XYD;
import X.C0XZ4;
import X.C0XZJ;
import X.C10GR;
import X.C1238100iK8;
import X.C18167079p;
import X.C19EG;
import X.C1C7U;
import X.C786410Ut5;
import X.C851430Xaf;
import X.C852170Xbr;
import X.C854360XfO;
import X.EnumC851410Xad;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate;

/* JADX INFO: loaded from: classes14.dex */
public class AfS81S0101000_13 implements C09JN {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS81S0101000_13 afS81S0101000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.quickSmsLogin$3");
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS81S0101000_13.l0).getMobParams().LJJLIIIJJI(), "enter_from");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS81S0101000_13.l0).getMobParams().LLIIJI(), "enter_method");
        clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.FAILURE.getValue());
        clientSmsVerificationResultEvent.LJIIL(afS81S0101000_13.i1);
        clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJIIIIZZ();
        ((C0XZJ) ((Throwable) obj)).getErrorCode();
        C1C7U.LIZIZ("NetworkHelper@8b8f.quickSmsLogin$3");
    }

    public static final void accept$1(AfS81S0101000_13 afS81S0101000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.validateCode$2");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        C0XYD c0xyd = (C0XYD) afS81S0101000_13.l0;
        c852170Xbr.getClass();
        C852170Xbr.LJII(true, c0xyd);
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS81S0101000_13.l0).getMobParams().LJJLIIIJJI(), "enter_from");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS81S0101000_13.l0).getMobParams().LLIIJI(), "enter_method");
        clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.SUCCESS.getValue());
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        int i = afS81S0101000_13.i1;
        c0xz4.getClass();
        clientSmsVerificationResultEvent.LJIIL(C0XZ4.LJJI(i));
        clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJIIIIZZ();
        C1C7U.LIZIZ("NetworkHelper@8b8f.validateCode$2");
    }

    public static final void accept$2(AfS81S0101000_13 afS81S0101000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.validateCode$3");
        if (obj instanceof C0XZJ) {
            C852170Xbr c852170Xbr = C852170Xbr.LIZ;
            C0XYD c0xyd = (C0XYD) afS81S0101000_13.l0;
            c852170Xbr.getClass();
            C852170Xbr.LJII(false, c0xyd);
        }
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS81S0101000_13.l0).getMobParams().LJJLIIIJJI(), "enter_from");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS81S0101000_13.l0).getMobParams().LLIIJI(), "enter_method");
        clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.FAILURE.getValue());
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        int i = afS81S0101000_13.i1;
        c0xz4.getClass();
        clientSmsVerificationResultEvent.LJIIL(C0XZ4.LJJI(i));
        clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJIIIIZZ();
        C1C7U.LIZIZ("NetworkHelper@8b8f.validateCode$3");
    }

    public static final void accept$3(AfS81S0101000_13 afS81S0101000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.changeMobileNum$4");
        C851430Xaf.LIZ(((C0XZJ) ((Throwable) obj)).getErrorCode(), ((C0XYD) afS81S0101000_13.l0).getMobParams().LJJLIIIJJI(), "rebind_phone_click", "phone", null);
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS81S0101000_13.l0).getMobParams().LJJLIIIJJI(), "enter_from");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS81S0101000_13.l0).getMobParams().LLIIJI(), "enter_method");
        clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.FAILURE.getValue());
        clientSmsVerificationResultEvent.LJIIL(afS81S0101000_13.i1);
        clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS81S0101000_13.l0).getMobParams().RR(), "page");
        clientSmsVerificationResultEvent.LJIIIIZZ();
        C1C7U.LIZIZ("NetworkHelper@8b8f.changeMobileNum$4");
    }

    public static final void accept$4(AfS81S0101000_13 afS81S0101000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.checkCode$2");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        C0XYD c0xyd = (C0XYD) afS81S0101000_13.l0;
        c852170Xbr.getClass();
        C852170Xbr.LJII(true, c0xyd);
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS81S0101000_13.l0).getMobParams().LJJLIIIJJI(), "enter_from");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS81S0101000_13.l0).getMobParams().LLIIJI(), "enter_method");
        clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.SUCCESS.getValue());
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        int i = afS81S0101000_13.i1;
        c0xz4.getClass();
        clientSmsVerificationResultEvent.LJIIL(C0XZ4.LJJI(i));
        clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJI(CardStruct.IStatusCode.DEFAULT, "error_code");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS81S0101000_13.l0).getMobParams().RR(), "page");
        clientSmsVerificationResultEvent.LJIIIIZZ();
        C1C7U.LIZIZ("NetworkHelper@8b8f.checkCode$2");
    }

    public static final void accept$5(AfS81S0101000_13 afS81S0101000_13, Object obj) {
        C1C7U.LIZ("EmailPopUp@351.showPopUpAsync$disposable$2");
        C0XQ3 c0xq3 = C0XQ3.LIZ;
        final C19EG c19eg = (C19EG) afS81S0101000_13.l0;
        final int i = afS81S0101000_13.i1;
        c0xq3.getClass();
        if (!((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).LJIJI().booleanValue()) {
            final boolean z = C0XQ3.LIZLLL;
            switch (C18167079p.LIZ()) {
                case 1:
                    if (i == 1 || i == 2) {
                        PopupManager.LJIJI(new C10GR(c19eg, i, z) { // from class: X.0iK7
                            public final C19EG LL;
                            public final int LLILLJJLI;
                            public final boolean LLILLL;
                            public final boolean LLILZ = false;

                            @Override // X.InterfaceC20660515sx
                            public final int getPriority() {
                                int i2 = this.LLILLJJLI;
                                if (i2 != 1) {
                                    return i2 != 2 ? 229 : 447;
                                }
                                return 450;
                            }

                            @Override // X.InterfaceC20660415sw
                            public final C688120Qyw i2() {
                                C19EG c19eg2 = this.LL;
                                return new C688120Qyw(c19eg2, c19eg2, null);
                            }

                            @Override // X.InterfaceC20659015si
                            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                Keva keva = C854360XfO.LIZ;
                                C854360XfO.LIZJ(Integer.valueOf(this.LLILLJJLI));
                                C1238080iK6.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, c20656615sK).show();
                            }

                            {
                                this.LL = c19eg;
                                this.LLILLJJLI = i;
                                this.LLILLL = z;
                            }
                        }, true);
                    }
                    break;
                case 2:
                    if (i == 0) {
                        PopupManager.LJIJI(new C1238100iK8(i, c19eg, z), true);
                    }
                    break;
                case 3:
                    if (i == 0) {
                        PopupManager.LJIJI(new C10GR(c19eg, i, z) { // from class: X.0iK7
                            public final C19EG LL;
                            public final int LLILLJJLI;
                            public final boolean LLILLL;
                            public final boolean LLILZ = false;

                            @Override // X.InterfaceC20660515sx
                            public final int getPriority() {
                                int i2 = this.LLILLJJLI;
                                if (i2 != 1) {
                                    return i2 != 2 ? 229 : 447;
                                }
                                return 450;
                            }

                            @Override // X.InterfaceC20660415sw
                            public final C688120Qyw i2() {
                                C19EG c19eg2 = this.LL;
                                return new C688120Qyw(c19eg2, c19eg2, null);
                            }

                            @Override // X.InterfaceC20659015si
                            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                Keva keva = C854360XfO.LIZ;
                                C854360XfO.LIZJ(Integer.valueOf(this.LLILLJJLI));
                                C1238080iK6.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, c20656615sK).show();
                            }

                            {
                                this.LL = c19eg;
                                this.LLILLJJLI = i;
                                this.LLILLL = z;
                            }
                        }, true);
                    }
                    break;
                case 4:
                case 5:
                    if (i == 0) {
                        PopupManager.LJIJI(new C1238100iK8(i, c19eg, z), true);
                    } else {
                        PopupManager.LJIJI(new C10GR(c19eg, i, z) { // from class: X.0iK7
                            public final C19EG LL;
                            public final int LLILLJJLI;
                            public final boolean LLILLL;
                            public final boolean LLILZ = false;

                            @Override // X.InterfaceC20660515sx
                            public final int getPriority() {
                                int i2 = this.LLILLJJLI;
                                if (i2 != 1) {
                                    return i2 != 2 ? 229 : 447;
                                }
                                return 450;
                            }

                            @Override // X.InterfaceC20660415sw
                            public final C688120Qyw i2() {
                                C19EG c19eg2 = this.LL;
                                return new C688120Qyw(c19eg2, c19eg2, null);
                            }

                            @Override // X.InterfaceC20659015si
                            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                Keva keva = C854360XfO.LIZ;
                                C854360XfO.LIZJ(Integer.valueOf(this.LLILLJJLI));
                                C1238080iK6.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, c20656615sK).show();
                            }

                            {
                                this.LL = c19eg;
                                this.LLILLJJLI = i;
                                this.LLILLL = z;
                            }
                        }, true);
                    }
                    C854360XfO.LIZLLL(false);
                    break;
                case 6:
                    PopupManager.LJIJI(new C10GR(c19eg, i, z) { // from class: X.0iK7
                        public final C19EG LL;
                        public final int LLILLJJLI;
                        public final boolean LLILLL;
                        public final boolean LLILZ = false;

                        @Override // X.InterfaceC20660515sx
                        public final int getPriority() {
                            int i2 = this.LLILLJJLI;
                            if (i2 != 1) {
                                return i2 != 2 ? 229 : 447;
                            }
                            return 450;
                        }

                        @Override // X.InterfaceC20660415sw
                        public final C688120Qyw i2() {
                            C19EG c19eg2 = this.LL;
                            return new C688120Qyw(c19eg2, c19eg2, null);
                        }

                        @Override // X.InterfaceC20659015si
                        public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                            Keva keva = C854360XfO.LIZ;
                            C854360XfO.LIZJ(Integer.valueOf(this.LLILLJJLI));
                            C1238080iK6.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, c20656615sK).show();
                        }

                        {
                            this.LL = c19eg;
                            this.LLILLJJLI = i;
                            this.LLILLL = z;
                        }
                    }, true);
                    C854360XfO.LIZLLL(false);
                    break;
            }
        } else {
            C0XQ3.LIZ();
        }
        C1C7U.LIZIZ("EmailPopUp@351.showPopUpAsync$disposable$2");
    }

    public static final void accept$6(AfS81S0101000_13 afS81S0101000_13, Object obj) {
        C1C7U.LIZ("X2CBaseInflate@93f.addDestroyTask$1");
        if (!((X2CBaseInflate) afS81S0101000_13.l0).LLILLL && obj.hashCode() == afS81S0101000_13.i1) {
            X2CBaseInflate x2CBaseInflate = (X2CBaseInflate) afS81S0101000_13.l0;
            x2CBaseInflate.LLILLL = true;
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS113S0100000_13(x2CBaseInflate, 203));
        }
        C1C7U.LIZIZ("X2CBaseInflate@93f.addDestroyTask$1");
    }

    public AfS81S0101000_13(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
