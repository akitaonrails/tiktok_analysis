package X;

import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520930Kbr {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZJ(String str) {
        String upperCase;
        if (str == null || (upperCase = str.toUpperCase(Locale.ROOT)) == null) {
            return R.attr.fxy;
        }
        switch (upperCase.hashCode()) {
            case -1844743822:
                if (!upperCase.equals("#141728")) {
                    return R.attr.fxy;
                }
                return R.attr.c8g;
            case -1829030483:
                if (!upperCase.equals("#1E1E35")) {
                    return R.attr.fxy;
                }
                return R.attr.epm;
            case -1819244048:
                if (!upperCase.equals("#20D5EC")) {
                    return R.attr.fxy;
                }
                return R.attr.fxx;
            case -1622134749:
                if (!upperCase.equals("#FFFFFFFF")) {
                    return R.attr.fxy;
                }
                return R.attr.ezm;
            case -1226267613:
                if (!upperCase.equals("#FFFFFF")) {
                    return R.attr.fxy;
                }
                return R.attr.ezm;
            case 1545164862:
                if (!upperCase.equals("#F2383838")) {
                    return R.attr.fxy;
                }
                return R.attr.c9e;
            case 1696557067:
                if (!upperCase.equals("#80FE2C55")) {
                    return R.attr.fxy;
                }
                return R.attr.c9d;
            case 2054356338:
                if (!upperCase.equals("#FF141728")) {
                    return R.attr.fxy;
                }
                return R.attr.c8g;
            case 2079856112:
                if (!upperCase.equals("#FF20D5EC")) {
                    return R.attr.fxy;
                }
                return R.attr.fxx;
            default:
                return R.attr.fxy;
        }
    }

    public static FrameLayout LIZ(Context context, C520920Kbq c520920Kbq) {
        int size;
        List urls;
        int i;
        List urls2;
        int i2;
        int i3;
        List urls3;
        if (context == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        int iLIZ = C439101nJ.LIZ(1);
        ImageModel imageModel = c520920Kbq.LIZIZ;
        if (imageModel != null && (urls3 = imageModel.getUrls()) != null) {
            size = urls3.size();
        } else {
            size = 0;
        }
        if (size > 0) {
            ImageView imageView = new ImageView(context);
            ImageModel imageModel2 = c520920Kbq.LIZIZ;
            if (imageModel2 != null) {
                i3 = imageModel2.height;
            } else {
                i3 = 0;
            }
            int iLIZ2 = C439101nJ.LIZ(i3);
            if (iLIZ2 == 0) {
                iLIZ2 = C439101nJ.LIZ(54);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iLIZ2);
            layoutParams.gravity = 49;
            C786410Ut5.c6(imageView, layoutParams);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setTag("halo");
            frameLayout.addView(imageView);
        }
        ImageModel imageModel3 = c520920Kbq.LIZ;
        if (imageModel3 != null && (urls2 = imageModel3.getUrls()) != null && urls2.size() > 0) {
            ImageView imageView2 = new ImageView(context);
            ImageModel imageModel4 = c520920Kbq.LIZ;
            if (imageModel4 != null) {
                i2 = imageModel4.height;
            } else {
                i2 = 1;
            }
            int iLIZ3 = C439101nJ.LIZ(i2);
            if (iLIZ3 == 0) {
                iLIZ3 = iLIZ;
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, iLIZ3);
            layoutParams2.gravity = 49;
            C786410Ut5.c6(imageView2, layoutParams2);
            imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView2.setTag("top");
            frameLayout.addView(imageView2);
        }
        ImageModel imageModel5 = c520920Kbq.LIZJ;
        if (imageModel5 != null && (urls = imageModel5.getUrls()) != null && urls.size() > 0) {
            ImageView imageView3 = new ImageView(context);
            ImageModel imageModel6 = c520920Kbq.LIZJ;
            if (imageModel6 != null) {
                i = imageModel6.height;
            } else {
                i = 1;
            }
            int iLIZ4 = C439101nJ.LIZ(i);
            if (iLIZ4 != 0) {
                iLIZ = iLIZ4;
            }
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, iLIZ);
            layoutParams3.gravity = 81;
            C786410Ut5.c6(imageView3, layoutParams3);
            imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView3.setTag("bottom");
            frameLayout.addView(imageView3);
        }
        ViewOnAttachStateChangeListenerC521700Kd6 viewOnAttachStateChangeListenerC521700Kd6 = new ViewOnAttachStateChangeListenerC521700Kd6(c520920Kbq, 3);
        if (frameLayout.getChildCount() == 0) {
            return null;
        }
        frameLayout.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC521700Kd6);
        return frameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Jfc, android.view.View] */
    public static C785240UrC LIZIZ(View view, C497790Jfd c497790Jfd, EnumC1120860fH2 enumC1120860fH2, C520910Kbp c520910Kbp, int i) {
        Context context;
        if ((i & 8) != 0) {
            enumC1120860fH2 = null;
        }
        if ((i & 16) != 0) {
            c520910Kbp = null;
        }
        if (enumC1120860fH2 != null) {
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            WeakReference weakReference = new WeakReference(context);
            if (weakReference.get() != null) {
                try {
                    final Context context2 = (Context) weakReference.get();
                    if (context2 != null) {
                        ?? r0 = new LinearLayout(context2) { // from class: X.0Jfc
                            public final C16F5 LL;
                            public final C1324720kZq LLILLJJLI;

                            {
                                super(context2, null, 0);
                                C786410Ut5.Td(C786410Ut5.ne(context2), R.layout.gfl, this, true);
                                this.LL = (C16F5) findViewById(R.id.zba);
                                this.LLILLJJLI = (C1324720kZq) findViewById(R.id.lag);
                            }

                            public final void LIZ(C497790Jfd c497790Jfd2) {
                                String str;
                                List urls;
                                int iLIZ;
                                int iLIZ2;
                                C16F5 c16f5 = this.LL;
                                Text text = c497790Jfd2.LJ;
                                String str2 = null;
                                if (text != null) {
                                    str = text.key;
                                } else {
                                    str = null;
                                }
                                if (str != null && str.length() != 0) {
                                    C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                                    String str3 = c497790Jfd2.LJ.key;
                                    c1124870fNVLIZJ.getClass();
                                    String strLIZIZ = C1124870fNV.LIZIZ(str3);
                                    if (strLIZIZ != null && strLIZIZ.length() != 0) {
                                        str2 = strLIZIZ;
                                    } else {
                                        Text text2 = c497790Jfd2.LJ;
                                        if (text2 != null) {
                                            str2 = text2.defaultPattern;
                                        }
                                    }
                                } else {
                                    Text text3 = c497790Jfd2.LJ;
                                    if (text3 != null) {
                                        str2 = text3.defaultPattern;
                                    }
                                }
                                c16f5.setText(str2);
                                String str4 = c497790Jfd2.LIZ;
                                if (str4 != null) {
                                    try {
                                        this.LL.setTextColor(C497740JfY.LJI(R.attr.c8f, str4));
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                                if (c497790Jfd2.LIZLLL > 0) {
                                    this.LL.getLayoutParams().width = c497790Jfd2.LIZLLL;
                                }
                                int i2 = c497790Jfd2.LIZJ;
                                if (i2 > 0) {
                                    this.LL.setMaxLines(i2);
                                }
                                ImageModel imageModel = c497790Jfd2.LJI;
                                if (imageModel != null && (urls = imageModel.getUrls()) != null && !urls.isEmpty()) {
                                    C786410Ut5.LLJJIII(this.LLILLJJLI, 0);
                                    ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
                                    int i3 = c497790Jfd2.LJI.width;
                                    if (i3 < 20) {
                                        iLIZ = C439101nJ.LIZ(20);
                                    } else {
                                        iLIZ = C439101nJ.LIZ(i3);
                                    }
                                    layoutParams.width = iLIZ;
                                    ViewGroup.LayoutParams layoutParams2 = this.LLILLJJLI.getLayoutParams();
                                    int i4 = c497790Jfd2.LJI.height;
                                    if (i4 < 20) {
                                        iLIZ2 = C439101nJ.LIZ(20);
                                    } else {
                                        iLIZ2 = C439101nJ.LIZ(i4);
                                    }
                                    layoutParams2.height = iLIZ2;
                                    C1819620xS4.LIZ().LIZJ(c497790Jfd2.LJI.getUrls()).LJJI(this.LLILLJJLI);
                                } else {
                                    C786410Ut5.LLJJIII(this.LLILLJJLI, 8);
                                }
                                Intrinsics.LJFF(c497790Jfd2.LJII, Boolean.TRUE);
                            }
                        };
                        r0.LIZ(c497790Jfd);
                        C785240UrC c785240UrC = new C785240UrC(view);
                        c785240UrC.LIZJ = r0;
                        c785240UrC.LJ = new ACListenerS142S0100000_7(c520910Kbp, 179);
                        c785240UrC.LJIILLIIL = new C521970KdX(c520910Kbp, 2);
                        c785240UrC.LJIILL = new C521980KdY(c520910Kbp, 3);
                        String str = c497790Jfd.LIZIZ;
                        if (str != null && str.length() != 0) {
                            c785240UrC.LIZIZ(LIZJ(c497790Jfd.LIZIZ));
                        }
                        long j = c497790Jfd.LJIIIIZZ;
                        if (j < Mp4ScreenVideoLoadTimeout.CONTROL) {
                            c785240UrC.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
                            c785240UrC.LJIIIZ = true;
                        } else {
                            c785240UrC.LJIIIIZZ = j;
                            c785240UrC.LJIIIZ = true;
                        }
                        C520920Kbq c520920Kbq = c497790Jfd.LJFF;
                        if (c520920Kbq != null) {
                            c785240UrC.LIZLLL = LIZ((Context) weakReference.get(), c520920Kbq);
                            return c785240UrC;
                        }
                        return c785240UrC;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return null;
    }
}
