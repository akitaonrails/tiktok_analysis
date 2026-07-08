package X;

import Y.ARunnableS99S0200000_30;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14MJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14MJ implements InterfaceC1671450tb5 {
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static final C14MJ LIZ = new C14MJ();
    public static final ConcurrentHashMap<String, C14MK<?>> LIZIZ = new ConcurrentHashMap<>();
    public static final PriorityBlockingQueue<C14MK<?>> LIZJ = new PriorityBlockingQueue<>();
    public static final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());

    public static final boolean LJII() {
        EnumC19356010o2 enumC19356010o2;
        C14MK<?> c14mk = LIZIZ.get("story_widget_guide");
        if (c14mk == null || (enumC19356010o2 = c14mk.LLILLJJLI) == null) {
            return false;
        }
        int i = C19355910o1.LIZ[enumC19356010o2.ordinal()];
        return i != 1 ? i != 2 ? i == 3 && LJ(InputStream.class, "story_widget_guide") != null : LJ(File.class, "story_widget_guide") != null : LJ(Bitmap.class, "story_widget_guide") != null;
    }

    public static final File LJI() {
        File file;
        String absolutePath;
        C08ON.LIZ();
        String str = C14MK.LLJILJILJ;
        if (str == null || str.length() == 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C14MK.LLJILJILJ);
        sbLIZ.append("text_dark_medium");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            return null;
        }
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles.length == 0 || (file = fileArrListFiles[0]) == null || (absolutePath = file.getAbsolutePath()) == null) {
            return null;
        }
        LIZ.getClass();
        return (File) LJIILJJIL(File.class, absolutePath);
    }

    public static Bitmap LIZJ(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final boolean LJIIJJI(final C1295960jpS c1295960jpS) {
        LIZ.getClass();
        InputStream inputStream = (InputStream) LJ(InputStream.class, "story_widget_guide");
        if (inputStream != null) {
            try {
                C1294250jmh.LJ(inputStream, null).LIZIZ(new InterfaceC1292040jj8() { // from class: X.08ok
                    public final /* synthetic */ boolean LLILLJJLI = true;

                    @Override // X.InterfaceC1292040jj8
                    public final void onResult(Object obj) {
                        C1294720jnS c1294720jnS = (C1294720jnS) obj;
                        if (c1294720jnS != null) {
                            c1295960jpS.setComposition(c1294720jnS);
                            if (this.LLILLJJLI) {
                                c1295960jpS.playAnimation();
                            }
                        }
                    }
                });
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    public static void LJIIL(String str) {
        String str2;
        C14MK<?> c14mk;
        EnumC1006910cJF enumC1006910cJF;
        while (true) {
            try {
                PriorityBlockingQueue<C14MK<?>> priorityBlockingQueue = LIZJ;
                if (!priorityBlockingQueue.isEmpty()) {
                    C14MK<?> c14mkPoll = priorityBlockingQueue.poll();
                    if (c14mkPoll != null && (str2 = c14mkPoll.LL) != null && (c14mk = LIZIZ.get(str2)) != null && c14mk.LLIZ && c14mk.LLILZ.getValue() > EnumC1487630oob.NO_PRELOAD.getValue() && ((enumC1006910cJF = c14mk.LLJ) != EnumC1006910cJF.DOWNLOADING || enumC1006910cJF != EnumC1006910cJF.SUCCESS)) {
                        if (!c14mk.LIZJ()) {
                            LIZ.getClass();
                            LIZIZ(c14mk, str);
                            return;
                        }
                    }
                } else {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
    }

    public static void LJIILLIIL(String str) {
        File[] fileArrListFiles;
        C14MK<?> c14mk = LIZIZ.get(str);
        if (c14mk != null) {
            if (!c14mk.LIZJ()) {
                c14mk.LLJ = EnumC1006910cJF.FAIL;
                c14mk.LLJIJIL++;
                LIZJ.add(c14mk);
            } else {
                c14mk.LLJIJIL = 0;
            }
            for (Map.Entry<C14MQ<?>, Class<?>> entry : c14mk.LLJILJIL.entrySet()) {
                Class<?> value = entry.getValue();
                C14MQ<?> key = entry.getKey();
                if (Intrinsics.LJFF(value, String.class)) {
                    LIZ.getClass();
                    key.LIZ(LJIILL(String.class, str));
                } else if (Intrinsics.LJFF(value, Bitmap.class)) {
                    LIZ.getClass();
                    key.LIZ(LJIILL(Bitmap.class, str));
                } else if (Intrinsics.LJFF(value, File.class)) {
                    LIZ.getClass();
                    key.LIZ(LJIILL(File.class, str));
                } else {
                    key.LIZ(null);
                }
            }
            c14mk.LLJILJIL.clear();
            C14MJ c14mj = LIZ;
            String strLJFF = c14mk.LJFF();
            final String strLJI = c14mk.LJI();
            c14mj.getClass();
            C0VSJ c0vsj = new C0VSJ(strLJFF);
            if (c0vsj.exists() && (fileArrListFiles = c0vsj.listFiles(new FilenameFilter() { // from class: X.14M9
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str2) {
                    return !Intrinsics.LJFF(str2, strLJI);
                }
            })) != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
        }
    }

    public static void LIZIZ(final C14MK c14mk, final String str) {
        LJIIIIZZ(c14mk.LL, "start", str);
        AbsDownloadListener absDownloadListener = new AbsDownloadListener() { // from class: X.14MN
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                if (downloadInfo != null) {
                    C14MK<Object> c14mk2 = c14mk;
                    String str2 = str;
                    C14MJ c14mj = C14MJ.LIZ;
                    String str3 = c14mk2.LL;
                    c14mj.getClass();
                    C14MJ.LJIIIIZZ(str3, "success", str2);
                    C14MJ.LJIILLIIL(c14mk2.LL);
                    return;
                }
                C14MK<Object> c14mk3 = c14mk;
                String str4 = str;
                C14MJ c14mj2 = C14MJ.LIZ;
                String str5 = c14mk3.LL;
                c14mj2.getClass();
                C14MJ.LJIIIIZZ(str5, "fail", str4);
                C14MJ.LJIILLIIL(c14mk3.LL);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                C14MJ c14mj = C14MJ.LIZ;
                String str2 = c14mk.LL;
                String str3 = str;
                c14mj.getClass();
                C14MJ.LJIIIIZZ(str2, "fail", str3);
                C14MJ.LJIILLIIL(c14mk.LL);
            }
        };
        try {
            String strLJFF = c14mk.LJFF();
            if (strLJFF != null && strLJFF.length() != 0) {
                AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(c14mk.LLILLL);
                abstractC2199801B7qWith.LJ = strLJFF;
                abstractC2199801B7qWith.LJII = 3;
                abstractC2199801B7qWith.LIZJ = c14mk.LJI();
                abstractC2199801B7qWith.LJIIJ = "dynamic_resource_download";
                abstractC2199801B7qWith.LJIIL = absDownloadListener;
                abstractC2199801B7qWith.LIZJ();
                c14mk.LLJ = EnumC1006910cJF.DOWNLOADING;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static Object LIZLLL(Class cls, String str) {
        C14MK<?> c14mk = LIZIZ.get(str);
        if (c14mk == null || !c14mk.LIZJ()) {
            return null;
        }
        C14MJ c14mj = LIZ;
        String str2 = c14mk.LLJI;
        c14mj.getClass();
        return LJIILJJIL(cls, str2);
    }

    public static Object LJ(Class cls, String str) {
        Object obj;
        Object objLIZLLL = LIZLLL(cls, str);
        if (objLIZLLL == null) {
            ConcurrentHashMap<String, C14MK<?>> concurrentHashMap = LIZIZ;
            C14MK<?> c14mk = concurrentHashMap.get(str);
            if (c14mk != null) {
                LIZ.getClass();
                LIZIZ(c14mk, "sync");
            }
            C14MK<?> c14mk2 = concurrentHashMap.get(str);
            if (c14mk2 != null) {
                obj = c14mk2.LLIZLLLIL;
            } else {
                obj = null;
            }
            return LJIILIIL(cls, obj);
        }
        return objLIZLLL;
    }

    public static final boolean LJIIIZ(ImageView imageView, String str) {
        LIZ.getClass();
        Bitmap bitmap = (Bitmap) LJ(Bitmap.class, str);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return true;
        }
        return false;
    }

    public static Object LJIILIIL(Class cls, Object obj) {
        if (obj != null) {
            try {
                if (Intrinsics.LJFF(cls, Bitmap.class)) {
                    if (obj instanceof Drawable) {
                        LIZ.getClass();
                        Bitmap bitmapLIZJ = LIZJ((Drawable) obj);
                        if (bitmapLIZJ != null) {
                            return bitmapLIZJ;
                        }
                    } else if (obj instanceof Integer) {
                        C844470XAv.LIZ.getClass();
                        return BitmapFactory.decodeResource(C844470XAv.LIZ().getResources(), ((Number) obj).intValue());
                    }
                } else if (Intrinsics.LJFF(cls, InputStream.class)) {
                    if (obj instanceof Integer) {
                        C844470XAv.LIZ.getClass();
                        return C844470XAv.LIZ().getResources().openRawResource(((Number) obj).intValue());
                    }
                    if (obj instanceof String) {
                        C844470XAv.LIZ.getClass();
                        return C844470XAv.LIZ().getResources().getAssets().open((String) obj);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static Object LJIILJJIL(Class cls, String str) {
        if (!Intrinsics.LJFF(cls, String.class)) {
            if (Intrinsics.LJFF(cls, Bitmap.class)) {
                return BitmapFactory.decodeFile(str);
            }
            if (Intrinsics.LJFF(cls, File.class)) {
                return new C0VSJ(str);
            }
            if (Intrinsics.LJFF(cls, InputStream.class)) {
                return new C0VSP(str);
            }
            return null;
        }
        return str;
    }

    public static Object LJIILL(Class cls, String str) {
        Object obj;
        Object objLIZLLL = LIZLLL(cls, str);
        if (objLIZLLL == null) {
            C14MK<?> c14mk = LIZIZ.get(str);
            if (c14mk != null) {
                obj = c14mk.LLIZLLLIL;
            } else {
                obj = null;
            }
            return LJIILIIL(cls, obj);
        }
        return objLIZLLL;
    }

    @Override // X.InterfaceC1671450tb5
    public final void LIZ(String str, final Function1<? super Bitmap, Unit> function1) {
        C14MJ c14mj = LIZ;
        C14MQ<Bitmap> c14mq = new C14MQ<Bitmap>() { // from class: X.14MP
            @Override // X.C14MQ
            public final void LIZ(Bitmap bitmap) {
                if (bitmap != null) {
                    function1.invoke(bitmap);
                }
            }
        };
        c14mj.getClass();
        LJFF(str, Bitmap.class, c14mq);
    }

    public static void LJFF(String str, Class cls, final C14MQ c14mq) {
        C14MQ<?> c14mq2 = new C14MQ<Object>() { // from class: X.14ML
            @Override // X.C14MQ
            public final void LIZ(Object obj) {
                if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                    c14mq.LIZ(obj);
                } else {
                    C786410Ut5.LJJZZIII(C14MJ.LJFF, new ARunnableS99S0200000_30(c14mq, obj, 13));
                }
            }
        };
        C14MK<?> c14mk = LIZIZ.get(str);
        if (c14mk != null) {
            LIZ.getClass();
            Object objLIZLLL = LIZLLL(cls, str);
            if (objLIZLLL != null) {
                c14mq2.LIZ(objLIZLLL);
                return;
            }
            c14mk.LLJILJIL.put(c14mq2, cls);
            if (c14mk.LLJ == EnumC1006910cJF.DOWNLOADING) {
                return;
            }
            LIZIZ(c14mk, "async");
            return;
        }
        c14mq2.LIZ(null);
    }

    public static void LJIIIIZZ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("key", str);
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        c2344009Gk.LJIIIIZZ("launch_type", str3);
        C20684815ws.LJIILLIIL("heli_download_resource", c2344009Gk.LIZ);
    }

    public static final void LJIIJ(final ImageView imageView, String str, final Function1<? super Boolean, Unit> function1) {
        C14MJ c14mj = LIZ;
        C14MQ<Bitmap> c14mq = new C14MQ<Bitmap>() { // from class: X.14MO
            @Override // X.C14MQ
            public final void LIZ(Bitmap bitmap) {
                boolean z;
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    imageView.setImageBitmap(bitmap2);
                }
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    if (bitmap2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    function12.invoke(Boolean.valueOf(z));
                }
            }
        };
        c14mj.getClass();
        LJFF(str, Bitmap.class, c14mq);
    }
}
