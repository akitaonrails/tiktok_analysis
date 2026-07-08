package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

/* JADX INFO: renamed from: X.0kW7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322410kW7 {
    public static boolean LIZJ(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C1328130kfL.LJIILIIL().LJIILL().LJII(C1324810kZz.LJI().LIZ(C1325710kbR.LIZ(uri), null));
    }

    public static void LIZ(C1322110kVd c1322110kVd, UrlModel urlModel, C1320700kTM c1320700kTM) {
        C1325710kbR[] c1325710kbRArrLJIILJJIL;
        if (c1322110kVd != null && urlModel != null && c1322110kVd.getContext() != null && (c1325710kbRArrLJIILJJIL = C1324840ka2.LJIILJJIL(urlModel, null, EnumC1331380kka.MEDIUM, null, Bitmap.Config.RGB_565, false)) != null && c1325710kbRArrLJIILJJIL.length > 0) {
            c1322110kVd.getContext();
            C1320640kTG c1320640kTG = new C1320640kTG(null);
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
            c1320810kTXLIZJ.LJFF(c1325710kbRArrLJIILJJIL, true);
            final InterfaceC1320650kTH[] interfaceC1320650kTHArr = {c1320640kTG, c1320700kTM};
            c1320810kTXLIZJ.LJIIIIZZ = new InterfaceC1320650kTH<INFO>(interfaceC1320650kTHArr) { // from class: X.0kTI
                public final InterfaceC1320650kTH<INFO>[] LIZ;

                {
                    this.LIZ = interfaceC1320650kTHArr;
                }

                @Override // X.InterfaceC1320650kTH
                public final void LIZIZ(String str) {
                    InterfaceC1320650kTH<INFO>[] interfaceC1320650kTHArr2 = this.LIZ;
                    if (interfaceC1320650kTHArr2 != null) {
                        for (InterfaceC1320650kTH<INFO> interfaceC1320650kTH : interfaceC1320650kTHArr2) {
                            if (interfaceC1320650kTH != null) {
                                interfaceC1320650kTH.LIZIZ(str);
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1320650kTH
                public final void LIZ(String str, Throwable th) {
                    InterfaceC1320650kTH<INFO>[] interfaceC1320650kTHArr2 = this.LIZ;
                    if (interfaceC1320650kTHArr2 != null) {
                        for (InterfaceC1320650kTH<INFO> interfaceC1320650kTH : interfaceC1320650kTHArr2) {
                            if (interfaceC1320650kTH != null) {
                                interfaceC1320650kTH.LIZ(str, th);
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1320650kTH
                public final void LIZJ(Object obj, String str) {
                    InterfaceC1320650kTH<INFO>[] interfaceC1320650kTHArr2 = this.LIZ;
                    if (interfaceC1320650kTHArr2 != null) {
                        for (InterfaceC1320650kTH<INFO> interfaceC1320650kTH : interfaceC1320650kTHArr2) {
                            if (interfaceC1320650kTH != null) {
                                interfaceC1320650kTH.LIZJ(obj, str);
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1320650kTH
                public final void LIZLLL(String str, Throwable th) {
                    InterfaceC1320650kTH<INFO>[] interfaceC1320650kTHArr2 = this.LIZ;
                    if (interfaceC1320650kTHArr2 != null) {
                        for (InterfaceC1320650kTH<INFO> interfaceC1320650kTH : interfaceC1320650kTHArr2) {
                            if (interfaceC1320650kTH != null) {
                                interfaceC1320650kTH.LIZLLL(str, th);
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1320650kTH
                public final void LJFF(Object obj, String str) {
                    InterfaceC1320650kTH<INFO>[] interfaceC1320650kTHArr2 = this.LIZ;
                    if (interfaceC1320650kTHArr2 != null) {
                        for (InterfaceC1320650kTH<INFO> interfaceC1320650kTH : interfaceC1320650kTHArr2) {
                            if (interfaceC1320650kTH != null) {
                                interfaceC1320650kTH.LJFF(obj, str);
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1320650kTH
                public final void LJ(String str, INFO info, Animatable animatable) {
                    InterfaceC1320650kTH<INFO>[] interfaceC1320650kTHArr2 = this.LIZ;
                    if (interfaceC1320650kTHArr2 != null) {
                        for (InterfaceC1320650kTH<INFO> interfaceC1320650kTH : interfaceC1320650kTHArr2) {
                            if (interfaceC1320650kTH != null) {
                                interfaceC1320650kTH.LJ(str, info, animatable);
                            }
                        }
                    }
                }
            };
            c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
        }
    }

    public static void LIZIZ(RemoteImageView remoteImageView, UrlModel urlModel, InterfaceC1320650kTH interfaceC1320650kTH) {
        if (remoteImageView != null && remoteImageView.getContext() != null && urlModel != null && !C086I.LIZIZ(urlModel.getUrlList())) {
            C1325710kbR[] c1325710kbRArrLJIILJJIL = C1324840ka2.LJIILJJIL(urlModel, null, EnumC1331380kka.MEDIUM, null, Bitmap.Config.ARGB_8888, false);
            if (c1325710kbRArrLJIILJJIL != null && c1325710kbRArrLJIILJJIL.length != 0) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIILJJIL = remoteImageView.getController();
                c1320810kTXLIZJ.LJIIJJI = false;
                c1320810kTXLIZJ.LJFF(c1325710kbRArrLJIILJJIL, true);
                c1320810kTXLIZJ.LJIIIIZZ = new C1320640kTG(interfaceC1320650kTH);
                remoteImageView.setController(c1320810kTXLIZJ.LIZ());
            }
        }
    }
}
