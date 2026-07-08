package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0I9C, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I9C {
    public static void LIZ(C1322110kVd c1322110kVd, final ImageModel imageModel) {
        C1324630kZh c1324630kZh;
        C1325710kbR[] c1325710kbRArr;
        if (c1322110kVd != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            int measuredWidth = c1322110kVd.getMeasuredWidth();
            int measuredHeight = c1322110kVd.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                c1324630kZh = new C1324630kZh(measuredWidth, measuredHeight);
            } else {
                c1324630kZh = null;
            }
            if (imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
                ArrayList arrayList = new ArrayList();
                C1335930krv c1335930krv = new C1335930krv();
                for (String str : imageModel.getUrls()) {
                    if (!C2093608Ic.LJ(str)) {
                        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                        if (c1324630kZh != null) {
                            c1325700kbQLIZLLL.LIZJ = c1324630kZh;
                        }
                        c1335930krv.LIZIZ++;
                        c1325700kbQLIZLLL.LJIIZILJ = c1335930krv;
                        arrayList.add(c1325700kbQLIZLLL.LIZ());
                    }
                }
                if (arrayList.size() == 0) {
                    c1325710kbRArr = new C1325710kbR[0];
                } else {
                    c1325710kbRArr = (C1325710kbR[]) arrayList.toArray(new C1325710kbR[arrayList.size()]);
                    if (c1325710kbRArr == null) {
                        return;
                    }
                }
            } else {
                c1325710kbRArr = new C1325710kbR[0];
            }
            if (c1325710kbRArr.length != 0) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
                c1320810kTXLIZJ.LJFF(c1325710kbRArr, true);
                c1320810kTXLIZJ.LJIIIIZZ = new InterfaceC1320650kTH<InterfaceC1330440kj4>(imageModel) { // from class: X.0I9D
                    public final ImageModel LIZ;

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZ(String str2, Throwable th) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZIZ(String str2) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZLLL(String str2, Throwable th) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LJFF(Object obj, String str2) {
                    }

                    {
                        this.LIZ = imageModel;
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str2) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LJ(String str2, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
                        InterfaceC1330440kj4 interfaceC1330440kj42 = interfaceC1330440kj4;
                        if (interfaceC1330440kj42 != null) {
                            interfaceC1330440kj42.getWidth();
                            interfaceC1330440kj42.getHeight();
                        }
                        ImageModel imageModel2 = this.LIZ;
                        if (imageModel2 != null) {
                            imageModel2.setLoaded(true);
                        }
                    }
                };
                c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
            }
        }
    }
}
