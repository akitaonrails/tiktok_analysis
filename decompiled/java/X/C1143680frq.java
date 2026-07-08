package X;

import Y.ARunnableS6S2000000_17;
import Y.AfS4S0211000_17;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.GeckoLoadLottieDefaultFontSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMatchForceNotUseCacheSetting;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0frq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143680frq {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LJIIIIZZ(C1143920fsE c1143920fsE) {
        boolean zLJI = MethodIDManager.LJI(137861);
        if (c1143920fsE == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            c1143920fsE.LIZLLL();
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public static void LJJIII(String str) {
        if (C497740JfY.LJII() != null && !TextUtils.isEmpty(str) && u.LJJIIJZLJL(str, "http", false)) {
            C1322200kVm.LIZ().LJIIZILJ(C1325710kbR.LIZIZ(str), C497740JfY.LJII());
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preLoadImageFromUrl,load resource error,url:");
        sbLIZ.append(str);
        C20441214yg.LJ("Gecko_Resource_Loader", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Drawable LIZ(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str10 = "";
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (str2 == null) {
                str4 = "";
            } else {
                str4 = str2;
            }
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getGeckoDrawable,load resource error,channel:");
                sbLIZ.append(str);
                sbLIZ.append(",fileName:");
                sbLIZ.append(str2);
                sbLIZ.append(",exception:");
                sbLIZ.append(e);
                C20441214yg.LJ("Gecko_Resource_Loader", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!TextUtils.isEmpty(C1143780fs0.LIZIZ(str3, str4))) {
                if (str == null) {
                    str8 = "";
                } else {
                    str8 = str;
                }
                if (str2 == null) {
                    str9 = "";
                } else {
                    str9 = str2;
                }
                InputStream inputStreamLIZLLL = C1143780fs0.LIZLLL(str8, str9);
                if (str2 != null) {
                    str10 = str2;
                }
                return Drawable.createFromStream(inputStreamLIZLLL, str10);
            }
            if (str == null) {
                str5 = "";
            } else {
                str5 = str;
            }
            if (str2 == null) {
                str6 = "";
            } else {
                str6 = str2;
            }
            String strLJIIL = C1143780fs0.LJIIL(str5, str6);
            if (!TextUtils.isEmpty(strLJIIL)) {
                return Drawable.createFromPath(strLJIIL);
            }
            if (str == null) {
                str7 = "";
            } else {
                str7 = str;
            }
            if (str2 != null) {
                str10 = str2;
            }
            List<String> listLJFF = C1143780fs0.LJFF(str7, str10);
            if (!listLJFF.isEmpty()) {
                return Drawable.createFromStream(new URL(listLJFF.get(0)).openStream(), str2);
            }
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getGeckoDrawable,load resource error,channel:");
        sbLIZ2.append(str);
        sbLIZ2.append(",fileName:");
        sbLIZ2.append(str2);
        C20441214yg.LJ("Gecko_Resource_Loader", C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }

    public static final InputStream LIZIZ(String str, String str2) {
        String strLJIIL;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                strLJIIL = C1143780fs0.LJIIL(str, str2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getGeckoDrawable,load resource error,channel:");
                sbLIZ.append(str);
                sbLIZ.append(",fileName:");
                sbLIZ.append(str2);
                sbLIZ.append(",exception:");
                sbLIZ.append(e);
                C20441214yg.LJ("Gecko_Resource_Loader", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!TextUtils.isEmpty(strLJIIL)) {
                return new C0VSP(new C0VSJ(strLJIIL));
            }
            List<String> listLJI = C1143780fs0.LJI(str, str2);
            if (!listLJI.isEmpty()) {
                return new URL(listLJI.get(0)).openStream();
            }
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getGeckoDrawable,load resource error,channel:");
        sbLIZ2.append(str);
        sbLIZ2.append(",fileName:");
        sbLIZ2.append(str2);
        C20441214yg.LJ("Gecko_Resource_Loader", C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }

    public static final void LJII(View view, List<String> list) {
        boolean zLJI = MethodIDManager.LJI(137861);
        if (list != null) {
            if (!list.isEmpty() && !C086I.LIZIZ(list)) {
                LJIIJ(view, list, ImageView.ScaleType.CENTER_CROP, null, false, null, 48);
            } else {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJJII(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C823050WQl.LIZIZ().submit(new ARunnableS6S2000000_17(str, str2, 0));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preLoadImage,load resource error,channel:");
        sbLIZ.append(str);
        sbLIZ.append(",fileName:");
        sbLIZ.append(str2);
        C20441214yg.LJ("Gecko_Resource_Loader", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJIIJ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            boolean zU61 = iHostResource.u61(str);
            if (!zU61 && str != null) {
                iHostResource.ud2(str);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fileExist = ");
            sbLIZ.append(zU61);
            C20441214yg.LJ("first load ", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("preload file,load resource error,channel:");
        sbLIZ2.append(str);
        sbLIZ2.append(",fileName:");
        sbLIZ2.append(str2);
        C20441214yg.LJ("Gecko_Resource_Loader", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final int LIZJ(SoundPool soundPool, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String strLIZIZ = C1143780fs0.LIZIZ(str, str2);
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    return soundPool.load(C497740JfY.LJII().getAssets().openFd(strLIZIZ), 1);
                }
                String strLJIIL = C1143780fs0.LJIIL(str, str2);
                if (!TextUtils.isEmpty(strLJIIL)) {
                    return soundPool.load(strLJIIL, 1);
                }
                LJJIIJ(str, str2);
                return 0;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getGeckoMp3,load gecko mp3 error,channel:");
                sbLIZ.append(str);
                sbLIZ.append(",fileName:");
                sbLIZ.append(str2);
                sbLIZ.append(",exception:");
                sbLIZ.append(e);
                C20441214yg.LJ("Gecko_Resource_Loader", C2188811AlT.LIZIZ(sbLIZ));
                return 0;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getGeckoMp3,load gecko mp3 error,channel:");
        sbLIZ2.append(str);
        sbLIZ2.append(",fileName:");
        sbLIZ2.append(str2);
        C20441214yg.LJ("Gecko_Resource_Loader", C2188811AlT.LIZIZ(sbLIZ2));
        return 0;
    }

    public static final void LIZLLL(View view, String str, String str2) {
        boolean zLJI = MethodIDManager.LJI(137861);
        LJ(view, str, str2, ImageView.ScaleType.CENTER_CROP);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LJIIJJI(C1295960jpS c1295960jpS, String str, String str2) {
        LJIIL(c1295960jpS, str, str2, "images", false, null, Boolean.FALSE, null);
    }

    public static final void LJJI(View view, ImageModel imageModel, boolean z) {
        if (view != null && imageModel != null && C842240X2g.LIZ(imageModel) != null) {
            LJJIFFI(view, C842240X2g.LIZ(imageModel), z);
        }
    }

    public static final void LJJIFFI(View view, List<String> list, boolean z) {
        if (view != null && list != null && !list.isEmpty()) {
            C1324610kZf c1324610kZfLJFF = C1819620xS4.LIZ().LJFF(Boolean.FALSE);
            c1324610kZfLJFF.LIZJ(list);
            c1324610kZfLJFF.LJIL = z;
            c1324610kZfLJFF.LJJI(view);
        }
    }

    public static final void LJ(View view, String str, String str2, ImageView.ScaleType scaleType) {
        boolean zLJI = MethodIDManager.LJI(137861);
        LJFF(view, str, str2, scaleType, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LJI(View view, String str, InterfaceC1142670fqD interfaceC1142670fqD, boolean z) {
        boolean zLJI = MethodIDManager.LJI(137861);
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            LJIIJ(view, Collections.singletonList(str), ImageView.ScaleType.CENTER_CROP, interfaceC1142670fqD, z, null, 32);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LJIILJJIL(C1295960jpS c1295960jpS, String str, String str2, boolean z) {
        LJIIL(c1295960jpS, str, str2, "images", z, null, Boolean.FALSE, null);
    }

    public static final void LJFF(View view, String str, String str2, ImageView.ScaleType scaleType, InterfaceC1142670fqD interfaceC1142670fqD) {
        String str3;
        String str4;
        boolean zLJI = MethodIDManager.LJI(137861);
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        List<String> listLJIIJJI = C1143780fs0.LJIIJJI(str3, str4);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        LJIIJ(view, listLJIIJJI, scaleType, interfaceC1142670fqD, false, C1143780fs0.LJ(str, str2), 16);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LJIILL(C1295960jpS c1295960jpS, String str, String str2, boolean z, InterfaceC1143790fs1 interfaceC1143790fs1) {
        LJIIL(c1295960jpS, str, str2, "images", z, interfaceC1143790fs1, Boolean.FALSE, null);
    }

    public static final boolean LJIJ(final C1295960jpS c1295960jpS, final String str, final boolean z, final Function1 function1, final WeakReference weakReference) {
        final long jNanoTime = System.nanoTime();
        if (c1295960jpS == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadGeckoLottieAsset,animView is null,assetPath:");
            sbLIZ.append(str);
            C2222681Bz0.LIZIZ(str, jNanoTime, C2188811AlT.LIZIZ(sbLIZ), false);
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            C2222681Bz0.LIZIZ(str, jNanoTime, "loadGeckoLottieAsset,assetPath is null", false);
            return false;
        }
        final C013C c013c = new C013C();
        c013c.element = true;
        try {
            C1292030jj7<C1294720jnS> c1292030jj7LJIILIIL = C1294250jmh.LJIILIIL(null, new ZipInputStream(C497740JfY.LJII().getAssets().open(str)), null);
            c1292030jj7LJIILIIL.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0frp
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    C1294720jnS c1294720jnS = (C1294720jnS) obj;
                    if (c1294720jnS != null) {
                        WeakReference<Function1<C1294720jnS, Unit>> weakReference2 = weakReference;
                        if (weakReference2 != null) {
                            Function1<C1294720jnS, Unit> function12 = weakReference2.get();
                            if (function12 != null) {
                                function12.invoke(c1294720jnS);
                            }
                        } else {
                            Function1<C1294720jnS, Unit> function13 = function1;
                            if (function13 != null) {
                                function13.invoke(c1294720jnS);
                            }
                            c1295960jpS.setComposition(c1294720jnS);
                            if (z) {
                                c1295960jpS.playAnimation();
                            }
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("loadGeckoLottieAsset success,assetPath:");
                        sbLIZ2.append(str);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        int i = C2222681Bz0.LIZ;
                        C2222681Bz0.LIZIZ(str, jNanoTime, strLIZIZ, true);
                    }
                }
            });
            c1292030jj7LJIILIIL.LIZ(new InterfaceC1292040jj8() { // from class: X.0frx
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    c013c.element = false;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("loadGeckoLottieZipUrl fail,assetPath:");
                    sbLIZ2.append(str);
                    sbLIZ2.append(",e:");
                    sbLIZ2.append(obj);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    int i = C2222681Bz0.LIZ;
                    C2222681Bz0.LIZIZ(str, jNanoTime, strLIZIZ, false);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c013c.element = false;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadGeckoLottieAsset exception,assetPath:");
            sbLIZ2.append(str);
            C2222681Bz0.LIZIZ(str, jNanoTime, C2188811AlT.LIZIZ(sbLIZ2), false);
        }
        return c013c.element;
    }

    public static final boolean LJIJI(final C1295960jpS c1295960jpS, final File file, final boolean z, final Function1 function1, final WeakReference weakReference) {
        final long jNanoTime = System.nanoTime();
        if (c1295960jpS == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("animView is null,path:");
            sbLIZ.append(file.getAbsolutePath());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int i = C2222681Bz0.LIZ;
            C2222681Bz0.LIZIZ(file.getAbsolutePath(), jNanoTime, strLIZIZ, false);
            return false;
        }
        if (!file.exists()) {
            int i2 = C2222681Bz0.LIZ;
            C2222681Bz0.LIZIZ(file.getAbsolutePath(), jNanoTime, "animView load file is not exists", false);
            return false;
        }
        final C013C c013c = new C013C();
        c013c.element = true;
        try {
            C1292030jj7<C1294720jnS> c1292030jj7LJIILIIL = C1294250jmh.LJIILIIL(null, new ZipInputStream(new C0VSP(file)), null);
            c1292030jj7LJIILIIL.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0frs
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    C1294720jnS c1294720jnS = (C1294720jnS) obj;
                    if (c1294720jnS != null) {
                        WeakReference<Function1<C1294720jnS, Unit>> weakReference2 = weakReference;
                        if (weakReference2 != null) {
                            Function1<C1294720jnS, Unit> function12 = weakReference2.get();
                            if (function12 != null) {
                                function12.invoke(c1294720jnS);
                            }
                        } else {
                            Function1<C1294720jnS, Unit> function13 = function1;
                            if (function13 != null) {
                                function13.invoke(c1294720jnS);
                            }
                            c1295960jpS.setComposition(c1294720jnS);
                            if (z) {
                                c1295960jpS.playAnimation();
                            }
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("load lottie success,path:");
                        sbLIZ2.append(file.getAbsolutePath());
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        int i3 = C2222681Bz0.LIZ;
                        C2222681Bz0.LIZIZ(file.getAbsolutePath(), jNanoTime, strLIZIZ2, true);
                    }
                }
            });
            c1292030jj7LJIILIIL.LIZ(new InterfaceC1292040jj8() { // from class: X.0frv
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    c013c.element = false;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("loadGeckoLottieZipUrl fail,path:");
                    sbLIZ2.append(file.getAbsolutePath());
                    sbLIZ2.append(",e:");
                    sbLIZ2.append(obj);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    int i3 = C2222681Bz0.LIZ;
                    C2222681Bz0.LIZIZ(file.getAbsolutePath(), jNanoTime, strLIZIZ2, false);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c013c.element = false;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("load lottie exception,path:");
            sbLIZ2.append(file.getAbsolutePath());
            sbLIZ2.append(",e:");
            sbLIZ2.append(e);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            int i3 = C2222681Bz0.LIZ;
            C2222681Bz0.LIZIZ(file.getAbsolutePath(), jNanoTime, strLIZIZ2, true);
        }
        return c013c.element;
    }

    public static final boolean LJIJJ(final C1295960jpS c1295960jpS, final File file, final boolean z, final Function1 function1, final WeakReference weakReference) {
        final long jNanoTime = System.nanoTime();
        if (c1295960jpS == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("animView is null,path:");
            sbLIZ.append(file.getAbsolutePath());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int i = C2222681Bz0.LIZ;
            C2222681Bz0.LIZIZ(file.getAbsolutePath(), jNanoTime, strLIZIZ, false);
            return false;
        }
        if (!file.exists()) {
            int i2 = C2222681Bz0.LIZ;
            C2222681Bz0.LIZIZ(file.getAbsolutePath(), jNanoTime, "animView load file is not exists", false);
            return false;
        }
        final C013C c013c = new C013C();
        c013c.element = true;
        try {
            c1295960jpS.setImageAssetDelegate(new InterfaceC1294390jmv() { // from class: X.0Lu9
                @Override // X.InterfaceC1294390jmv
                public final Bitmap LIZ(C1294320jmo c1294320jmo) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(file.getParent());
                    sbLIZ2.append('/');
                    sbLIZ2.append(c1294320jmo.LJ);
                    sbLIZ2.append('/');
                    sbLIZ2.append(c1294320jmo.LIZLLL);
                    return BitmapFactory.decodeFile(C2188811AlT.LIZIZ(sbLIZ2));
                }
            });
            C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(new C0VSP(file), null);
            c1292030jj7LJ.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0frt
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    C1294720jnS c1294720jnS = (C1294720jnS) obj;
                    if (c1294720jnS != null) {
                        WeakReference<Function1<C1294720jnS, Unit>> weakReference2 = weakReference;
                        if (weakReference2 != null) {
                            Function1<C1294720jnS, Unit> function12 = weakReference2.get();
                            if (function12 != null) {
                                function12.invoke(c1294720jnS);
                            }
                        } else {
                            Function1<C1294720jnS, Unit> function13 = function1;
                            if (function13 != null) {
                                function13.invoke(c1294720jnS);
                            }
                            c1295960jpS.setComposition(c1294720jnS);
                            if (z) {
                                c1295960jpS.playAnimation();
                            }
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("load lottie success,path:");
                        sbLIZ2.append(file.getAbsolutePath());
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        int i3 = C2222681Bz0.LIZ;
                        C2222681Bz0.LIZIZ(file.getAbsolutePath(), jNanoTime, strLIZIZ2, true);
                    }
                }
            });
            c1292030jj7LJ.LIZ(new InterfaceC1292040jj8() { // from class: X.0frw
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    c013c.element = false;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("loadGeckoLottieZipUrl fail,path:");
                    sbLIZ2.append(file.getAbsolutePath());
                    sbLIZ2.append(",e:");
                    sbLIZ2.append(obj);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    int i3 = C2222681Bz0.LIZ;
                    C2222681Bz0.LIZIZ(file.getAbsolutePath(), jNanoTime, strLIZIZ2, false);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c013c.element = false;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("load lottie exception,path:");
            sbLIZ2.append(file.getAbsolutePath());
            sbLIZ2.append(",e:");
            sbLIZ2.append(e);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            int i3 = C2222681Bz0.LIZ;
            C2222681Bz0.LIZIZ(file.getAbsolutePath(), jNanoTime, strLIZIZ2, true);
        }
        return c013c.element;
    }

    public static final boolean LJIJJLI(final C1295960jpS c1295960jpS, final List<String> list, final boolean z, Boolean bool, final Function1<? super C1294720jnS, Unit> function1, final WeakReference<Function1<C1294720jnS, Unit>> weakReference) {
        C1292030jj7<C1294720jnS> c1292030jj7LJIIJJI;
        boolean zLJI = MethodIDManager.LJI(137939);
        final long jNanoTime = System.nanoTime();
        boolean z2 = false;
        if (list.isEmpty()) {
            C2222681Bz0.LIZIZ(null, jNanoTime, "loadGeckoLottieZipUrl,url is null", false);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return false;
        }
        if (c1295960jpS != null && c1295960jpS.getContext() != null) {
            try {
                if (LiveMatchForceNotUseCacheSetting.INSTANCE.isEnable() && Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    c1292030jj7LJIIJJI = C1294250jmh.LJIIL(c1295960jpS.getContext(), list.get(0), null);
                } else {
                    c1292030jj7LJIIJJI = C1294250jmh.LJIIJJI(c1295960jpS.getContext(), list.get(0));
                }
                c1292030jj7LJIIJJI.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0frr
                    @Override // X.InterfaceC1292040jj8
                    public final void onResult(Object obj) {
                        C1294720jnS c1294720jnS = (C1294720jnS) obj;
                        if (c1294720jnS != null) {
                            WeakReference<Function1<C1294720jnS, Unit>> weakReference2 = weakReference;
                            if (weakReference2 != null) {
                                Function1<C1294720jnS, Unit> function12 = weakReference2.get();
                                if (function12 != null) {
                                    function12.invoke(c1294720jnS);
                                }
                            } else {
                                Function1<C1294720jnS, Unit> function13 = function1;
                                if (function13 != null) {
                                    function13.invoke(c1294720jnS);
                                }
                                c1295960jpS.setComposition(c1294720jnS);
                                if (z) {
                                    c1295960jpS.playAnimation();
                                }
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("loadGeckoLottieZipUrl success,url:");
                            sbLIZ.append(list);
                            sbLIZ.append("[0]");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            int i = C2222681Bz0.LIZ;
                            C2222681Bz0.LIZIZ((String) ListProtector.get(list, 0), jNanoTime, strLIZIZ, true);
                        }
                    }
                });
                c1292030jj7LJIIJJI.LIZ(new InterfaceC1292040jj8() { // from class: X.0fru
                    @Override // X.InterfaceC1292040jj8
                    public final void onResult(Object obj) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("loadGeckoLottieZipUrl fail,url:");
                        sbLIZ.append((String) ListProtector.get(list, 0));
                        sbLIZ.append(",e:");
                        sbLIZ.append(obj);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        int i = C2222681Bz0.LIZ;
                        C2222681Bz0.LIZIZ((String) ListProtector.get(list, 0), jNanoTime, strLIZIZ, false);
                    }
                });
                z2 = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadGeckoLottieZipUrl exception,lottieZipUrl:");
                sbLIZ.append((String) ListProtector.get(list, 0));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int i = C2222681Bz0.LIZ;
                C2222681Bz0.LIZIZ((String) ListProtector.get(list, 0), jNanoTime, strLIZIZ, false);
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return z2;
        }
        int i2 = C2222681Bz0.LIZ;
        C2222681Bz0.LIZIZ((String) ListProtector.get(list, 0), jNanoTime, "loadGeckoLottieZipUrl,animView is null", false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return false;
    }

    public static final void LJJ(View view, final String str, final String str2, boolean z, int i, Runnable runnable) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z2 = z;
        long jNanoTime = System.nanoTime();
        if (view == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadGeckoNinePatchImage，view is null,channel:");
            sbLIZ.append(str);
            sbLIZ.append(",fileName:");
            sbLIZ.append(str2);
            C2222681Bz0.LIZIZ("", jNanoTime, C2188811AlT.LIZIZ(sbLIZ), false);
            return;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if ((view instanceof C16FV) && C497740JfY.LJJ()) {
                z2 = true;
            }
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (str2 == null) {
                str4 = "";
            } else {
                str4 = str2;
            }
            if (!TextUtils.isEmpty(C1143780fs0.LIZIZ(str3, str4))) {
                C1091240eVG c1091240eVG = C1091220eVE.LIZ;
                C11NZ.LJJJJZ(0).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.09RU
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        try {
                            String str9 = str;
                            String str10 = "";
                            if (str9 == null) {
                                str9 = "";
                            }
                            String str11 = str2;
                            if (str11 != null) {
                                str10 = str11;
                            }
                            return BitmapFactory.decodeStream(C1143780fs0.LIZLLL(str9, str10));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJIIJ(6, "NinePatchUtil", e.getStackTrace());
                            C20441214yg.LJ("NinePatchUtil", e.getMessage());
                            return null;
                        }
                    }
                }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS4S0211000_17(view, z2, runnable, 3), new C09JN() { // from class: X.09RX
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("NinePatchUtil@39c.loadNinePatchFromAsset$3");
                        C20441214yg.LJIIJ(6, "NinePatchUtil", ((Throwable) obj).getStackTrace());
                        C1C7U.LIZIZ("NinePatchUtil@39c.loadNinePatchFromAsset$3");
                    }
                });
                return;
            }
            if (str == null) {
                str5 = "";
            } else {
                str5 = str;
            }
            if (str2 == null) {
                str6 = "";
            } else {
                str6 = str2;
            }
            final String strLJIIL = C1143780fs0.LJIIL(str5, str6);
            if (!TextUtils.isEmpty(strLJIIL) && new C0VSJ(strLJIIL).exists()) {
                C1091240eVG c1091240eVG2 = C1091220eVE.LIZ;
                C11NZ.LJJJJZ(0).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.09RV
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        try {
                            return BitmapFactory.decodeFile(strLJIIL);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJIIJ(6, "NinePatchUtil", e.getStackTrace());
                            C20441214yg.LJ("NinePatchUtil", e.getMessage());
                            return null;
                        }
                    }
                }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS4S0211000_17(view, z2, i, runnable, 2), new C09JN() { // from class: X.09RW
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("NinePatchUtil@39c.loadNinePatchDrawable$6");
                        C20441214yg.LJIIJ(6, "NinePatchUtil", ((Throwable) obj).getStackTrace());
                        C1C7U.LIZIZ("NinePatchUtil@39c.loadNinePatchDrawable$6");
                    }
                });
                return;
            }
            if (str == null) {
                str7 = "";
            } else {
                str7 = str;
            }
            if (str2 == null) {
                str8 = "";
            } else {
                str8 = str2;
            }
            List<String> listLJFF = C1143780fs0.LJFF(str7, str8);
            if (listLJFF != null && !listLJFF.isEmpty()) {
                ImageModel imageModel = new ImageModel();
                imageModel.mUrls = listLJFF;
                C1091220eVE.LIZIZ(imageModel, view, z2, i, runnable);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadGeckoNinePatchImage，channel:");
            sbLIZ2.append(str);
            sbLIZ2.append(",fileName:");
            sbLIZ2.append(str2);
            sbLIZ2.append(",url is null,can url error");
            C2222681Bz0.LIZIZ("", jNanoTime, C2188811AlT.LIZIZ(sbLIZ2), false);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("loadGeckoNinePatchImage，channel:");
        sbLIZ3.append(str);
        sbLIZ3.append(",fileName:");
        sbLIZ3.append(str2);
        sbLIZ3.append(",can not get resource url");
        C2222681Bz0.LIZIZ("", jNanoTime, C2188811AlT.LIZIZ(sbLIZ3), false);
    }

    public static void LJIIJ(View view, List list, ImageView.ScaleType scaleType, final InterfaceC1142670fqD interfaceC1142670fqD, boolean z, String str, int i) {
        boolean z2 = true;
        if ((i & 16) != 0) {
            z = true;
        }
        if ((i & 32) != 0) {
            str = null;
        }
        long jNanoTime = System.nanoTime();
        if (list != null && !list.isEmpty()) {
            z2 = false;
        }
        if (z2) {
            if (interfaceC1142670fqD != null) {
                interfaceC1142670fqD.LIZLLL("", new IllegalArgumentException("loadGeckoImage，url is null"));
            }
            C2222681Bz0.LIZIZ(null, jNanoTime, "loadGeckoImage，url is null", false);
            return;
        }
        if (view == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadGeckoImage，imageView is null,url:");
            sbLIZ.append(list);
            sbLIZ.append("[0]");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (interfaceC1142670fqD != null) {
                interfaceC1142670fqD.LIZLLL("", new IllegalArgumentException(strLIZIZ));
            }
            C2222681Bz0.LIZIZ("", jNanoTime, strLIZIZ, false);
            return;
        }
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(list);
        c1324610kZfLIZJ.LJJIIZI = str;
        c1324610kZfLIZJ.LJIL = z;
        c1324610kZfLIZJ.LJJ = Boolean.FALSE;
        c1324610kZfLIZJ.LJIJJ = scaleType;
        final long jNanoTime2 = System.nanoTime();
        c1324610kZfLIZJ.LJIIL = new InterfaceC1142670fqD() { // from class: X.0fro
            @Override // X.InterfaceC1142670fqD
            public final void LIZ() {
                InterfaceC1142670fqD interfaceC1142670fqD2 = interfaceC1142670fqD;
                if (interfaceC1142670fqD2 != null) {
                    interfaceC1142670fqD2.LIZ();
                }
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZIZ(Animatable animatable) {
                InterfaceC1142670fqD interfaceC1142670fqD2 = interfaceC1142670fqD;
                if (interfaceC1142670fqD2 != null) {
                    interfaceC1142670fqD2.LIZIZ(animatable);
                }
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZLLL(String str2, Exception exc) {
                InterfaceC1142670fqD interfaceC1142670fqD2 = interfaceC1142670fqD;
                if (interfaceC1142670fqD2 != null) {
                    interfaceC1142670fqD2.LIZLLL(str2, exc);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLoadFailed,imageUrl:");
                sbLIZ2.append(str2);
                sbLIZ2.append(",exception:");
                sbLIZ2.append(exc);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int i2 = C2222681Bz0.LIZ;
                C2222681Bz0.LIZIZ(str2, jNanoTime2, strLIZIZ2, false);
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZJ(int i2, int i3, String str2) {
                InterfaceC1142670fqD interfaceC1142670fqD2 = interfaceC1142670fqD;
                if (interfaceC1142670fqD2 != null) {
                    interfaceC1142670fqD2.LIZJ(i2, i3, str2);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onLoadSuccess,imageUrl:");
                sbLIZ2.append(str2);
                sbLIZ2.append(",width:");
                sbLIZ2.append(i2);
                sbLIZ2.append(",height:");
                sbLIZ2.append(i3);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int i4 = C2222681Bz0.LIZ;
                C2222681Bz0.LIZIZ(str2, jNanoTime2, strLIZIZ2, true);
            }
        };
        c1324610kZfLIZJ.LJJI(view);
        if (!(view instanceof C16FV) || !C497740JfY.LJJ()) {
            return;
        }
        C786410Ut5.bc((C16FV) view, -1.0f);
    }

    public static final void LJIIL(C1295960jpS c1295960jpS, String str, String str2, String str3, boolean z, InterfaceC1143790fs1 interfaceC1143790fs1, Boolean bool, Function1<? super C1294720jnS, Unit> function1) {
        LJIILIIL(c1295960jpS, str, str2, str3, z, interfaceC1143790fs1, bool, function1, null);
    }

    public static final void LJIILIIL(C1295960jpS c1295960jpS, String str, String str2, String str3, boolean z, InterfaceC1143790fs1 interfaceC1143790fs1, Boolean bool, Function1<? super C1294720jnS, Unit> function1, WeakReference<Function1<C1294720jnS, Unit>> weakReference) {
        boolean zLJIJI;
        long jNanoTime = System.nanoTime();
        if (c1295960jpS == null) {
            if (interfaceC1143790fs1 != null) {
                interfaceC1143790fs1.onFinish(false);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadGeckoLottie,animView is null,channel:");
            sbLIZ.append(str);
            sbLIZ.append(",fileName:");
            sbLIZ.append(str2);
            C2222681Bz0.LIZIZ("", jNanoTime, C2188811AlT.LIZIZ(sbLIZ), false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (interfaceC1143790fs1 != null) {
                interfaceC1143790fs1.onFinish(false);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadGeckoLottie,channel is null,channel:");
            sbLIZ2.append(str);
            sbLIZ2.append(",fileName:");
            sbLIZ2.append(str2);
            C2222681Bz0.LIZIZ("", jNanoTime, C2188811AlT.LIZIZ(sbLIZ2), false);
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            if (interfaceC1143790fs1 != null) {
                interfaceC1143790fs1.onFinish(false);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("loadGeckoLottie,fileName is null,channel:");
            sbLIZ3.append(str);
            sbLIZ3.append(",fileName:");
            sbLIZ3.append(str2);
            C2222681Bz0.LIZIZ("", jNanoTime, C2188811AlT.LIZIZ(sbLIZ3), false);
            return;
        }
        try {
            if (GeckoLoadLottieDefaultFontSetting.INSTANCE.enable()) {
                c1295960jpS.setFontAssetDelegate(new C1295870jpJ() { // from class: X.0fry
                    @Override // X.C1295870jpJ
                    public final Typeface LIZ(String str4, String str5, String str6) {
                        return C1697580uHE.LIZIZ(0.0f, 500, 0.0f, 0.0f, null, 0.0f, 0, null, 253);
                    }
                });
            }
            c1295960jpS.setImageAssetsFolder(str3);
            List<String> listLJFF = C1143780fs0.LJFF(str, str2);
            String strLIZIZ = C1143780fs0.LIZIZ(str, str2);
            if (!TextUtils.isEmpty(strLIZIZ) && LJIJ(c1295960jpS, strLIZIZ, z, function1, weakReference)) {
                if (interfaceC1143790fs1 != null) {
                    interfaceC1143790fs1.onFinish(true);
                    return;
                }
                return;
            }
            File fileLJII = C1143780fs0.LJII(str, str2);
            if (fileLJII != null && fileLJII.exists()) {
                if (u.LJIIZILJ(str2, "data.json", false)) {
                    zLJIJI = LJIJJ(c1295960jpS, fileLJII, z, function1, weakReference);
                } else {
                    zLJIJI = LJIJI(c1295960jpS, fileLJII, z, function1, weakReference);
                }
                if (zLJIJI) {
                    if (interfaceC1143790fs1 != null) {
                        interfaceC1143790fs1.onFinish(true);
                        return;
                    }
                    return;
                }
            }
            boolean zLJIJJLI = LJIJJLI(c1295960jpS, listLJFF, z, bool, function1, weakReference);
            if (interfaceC1143790fs1 != null) {
                interfaceC1143790fs1.onFinish(zLJIJJLI);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (interfaceC1143790fs1 != null) {
                interfaceC1143790fs1.onFinish(false);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("loadGeckoLottie,fileName is null,channel:");
            sbLIZ4.append(str);
            sbLIZ4.append(",fileName:");
            sbLIZ4.append(str2);
            sbLIZ4.append(",exception:");
            sbLIZ4.append(e);
            C2222681Bz0.LIZIZ("", jNanoTime, C2188811AlT.LIZIZ(sbLIZ4), false);
        }
    }
}
