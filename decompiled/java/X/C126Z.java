package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.126Z, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.streaks.util.StoryStreakHelper$loadAndCompileFireAnim$onAvatarLoaded$1$2", f = "StoryStreakHelper.kt", l = {}, m = "invokeSuspend")
public final class C126Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1295950jpR LLILLL;
    public final /* synthetic */ StoryStreakEnterEditParam LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC1685430txd<Context, String, StoryStreakEnterEditParam, String, String, Integer, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C126Z(Context context, String str, C1295950jpR c1295950jpR, StoryStreakEnterEditParam storyStreakEnterEditParam, String str2, InterfaceC1685430txd<? super Context, ? super String, ? super StoryStreakEnterEditParam, ? super String, ? super String, ? super Integer, Unit> interfaceC1685430txd, InterfaceC1364105Vn<? super C126Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = c1295950jpR;
        this.LLILZ = storyStreakEnterEditParam;
        this.LLILZIL = str2;
        this.LLILZLL = interfaceC1685430txd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C126Z(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String absolutePath;
        C1C7U.LIZ("StoryStreakHelper@ab47.loadAndCompileFireAnim$onAvatarLoaded$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0J9I c0j9i = C0J9I.LIZ;
        Context context = this.LL;
        String str = this.LLILLJJLI;
        C1295950jpR c1295950jpR = this.LLILLL;
        StoryStreakEnterEditParam storyStreakEnterEditParam = this.LLILZ;
        c0j9i.getClass();
        if (c1295950jpR == null) {
            absolutePath = "";
        } else {
            c1295950jpR.setBounds(0, 0, 526, 270);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0VSJ c0vsjLIZJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(new CreativeInfo(str, 0, null, 6, null), EnumC20228214Cy.PHOTO, "gif/story_streak_fire_anim.gif", true);
            c1295950jpR.LL.LJIIIZ.width();
            c1295950jpR.LL.LJIIIZ.height();
            int iLIZIZ = (((int) c1295950jpR.LL.LIZIZ()) / ((LSPassThroughRecordSizeConfig.DEFAULT / C126X.LIZ()) - 1)) + 1;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(526, 270, (Bitmap.Config) C0J9I.LIZIZ.getValue());
            C197006126a c197006126a = new C197006126a();
            c197006126a.LJI = new C0VSV(c0vsjLIZJ);
            int i = 0;
            do {
                try {
                    c197006126a.LJI.write((byte) "GIF89a".charAt(i));
                    i++;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    z = false;
                }
            } while (i < 6);
            z = true;
            c197006126a.LJFF = z;
            c197006126a.LIZLLL = 0;
            float fLIZ = C126X.LIZ();
            if (fLIZ != 0.0f) {
                c197006126a.LJ = Math.round(100.0f / fLIZ);
            }
            c197006126a.LJIILL = 20;
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColor(C417570GYx.LIZ(storyStreakEnterEditParam.getStreakLevel(), context));
            for (int i2 = 0; i2 < iLIZIZ; i2++) {
                c1295950jpR.LJJIII(i2 / iLIZIZ);
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
                c1295950jpR.draw(canvas);
                if (bitmapCreateBitmap != null && c197006126a.LJFF) {
                    try {
                        int width = bitmapCreateBitmap.getWidth();
                        int height = bitmapCreateBitmap.getHeight();
                        c197006126a.LIZ = width;
                        c197006126a.LIZIZ = height;
                        c197006126a.LJII = bitmapCreateBitmap;
                        c197006126a.LIZIZ();
                        c197006126a.LIZ();
                        if (c197006126a.LJIILJJIL) {
                            c197006126a.LJFF(c197006126a.LIZ);
                            c197006126a.LJFF(c197006126a.LIZIZ);
                            c197006126a.LJI.write(c197006126a.LJIILIIL | 240);
                            c197006126a.LJI.write(0);
                            c197006126a.LJI.write(0);
                            OutputStream outputStream = c197006126a.LJI;
                            byte[] bArr = c197006126a.LJIIJJI;
                            outputStream.write(bArr, 0, bArr.length);
                            int length = 768 - c197006126a.LJIIJJI.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                c197006126a.LJI.write(0);
                            }
                            if (c197006126a.LIZLLL >= 0) {
                                c197006126a.LIZLLL();
                            }
                        }
                        c197006126a.LIZJ();
                        c197006126a.LJI.write(44);
                        c197006126a.LJFF(0);
                        c197006126a.LJFF(0);
                        c197006126a.LJFF(c197006126a.LIZ);
                        c197006126a.LJFF(c197006126a.LIZIZ);
                        if (c197006126a.LJIILJJIL) {
                            c197006126a.LJI.write(0);
                        } else {
                            c197006126a.LJI.write(c197006126a.LJIILIIL | 128);
                        }
                        if (!c197006126a.LJIILJJIL) {
                            OutputStream outputStream2 = c197006126a.LJI;
                            byte[] bArr2 = c197006126a.LJIIJJI;
                            outputStream2.write(bArr2, 0, bArr2.length);
                            int length2 = 768 - c197006126a.LJIIJJI.length;
                            for (int i4 = 0; i4 < length2; i4++) {
                                c197006126a.LJI.write(0);
                            }
                        }
                        c197006126a.LJ();
                        c197006126a.LJIILJJIL = false;
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
            System.currentTimeMillis();
            if (c197006126a.LJFF) {
                c197006126a.LJFF = false;
                try {
                    c197006126a.LJI.write(59);
                    c197006126a.LJI.flush();
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
            C126M.LIZ = System.currentTimeMillis() - jCurrentTimeMillis;
            C786410Ut5.LJJJJ(bitmapCreateBitmap);
            absolutePath = c0vsjLIZJ.getAbsolutePath();
        }
        InterfaceC1685430txd<Context, String, StoryStreakEnterEditParam, String, String, Integer, Unit> interfaceC1685430txd = this.LLILZLL;
        Context context2 = this.LL;
        String str2 = this.LLILLJJLI;
        StoryStreakEnterEditParam storyStreakEnterEditParam2 = this.LLILZ;
        String str3 = this.LLILZIL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C485390J1t(interfaceC1685430txd, context2, str2, storyStreakEnterEditParam2, str3, absolutePath, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryStreakHelper@ab47.loadAndCompileFireAnim$onAvatarLoaded$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
