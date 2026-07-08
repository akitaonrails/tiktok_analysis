package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.animation.IAnimationQueueManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS1S1500100_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.169x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem$showShowAgain$1", f = "EasterEggForShareAssem.kt", l = {}, m = "invokeSuspend")
public final class C207299169x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EasterEggForShareAssem LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0NPA LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207299169x(EasterEggForShareAssem easterEggForShareAssem, String str, C0NPA c0npa, List<String> list, InterfaceC1364105Vn<? super C207299169x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = easterEggForShareAssem;
        this.LLILLJJLI = str;
        this.LLILLL = c0npa;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C207299169x(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v46, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.File] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        SessionInfo sessionInfoJo;
        String strLJII;
        String str;
        ImageComponent imageComponent;
        List<String> list;
        T t;
        String strLJIILJJIL;
        IMUser singleChatFromUser;
        IMUser singleChatFromUser2;
        C1C7U.LIZ("EasterEggForShareAssem@d88a.showShowAgain$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final Context context = this.LL.getContext();
        if (context == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showShowAgain$1");
            return unit;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.LL.Vo("repeated_sending", this.LLILLJJLI);
        if (((Number) C279130Awp.LIZ.getValue()).intValue() == 2) {
            this.LL.So(jCurrentTimeMillis, "repeated_sending", this.LLILLJJLI, "not_shown", "downgrade");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showShowAgain$1");
            return unit2;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null && C0SXG.LIZ(c19egLIZ)) {
            this.LL.So(jCurrentTimeMillis, "repeated_sending", this.LLILLJJLI, "not_shown", "landscape");
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showShowAgain$1");
            return unit3;
        }
        SessionInfo sessionInfoJo2 = this.LL.Jo();
        if ((sessionInfoJo2 != null && (singleChatFromUser2 = sessionInfoJo2.getSingleChatFromUser()) != null && singleChatFromUser2.isBlock()) || ((sessionInfoJo = this.LL.Jo()) != null && (singleChatFromUser = sessionInfoJo.getSingleChatFromUser()) != null && singleChatFromUser.isBlocked())) {
            this.LL.So(jCurrentTimeMillis, "repeated_sending", this.LLILLJJLI, "not_shown", "blocked_user");
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showShowAgain$1");
            return unit4;
        }
        this.LL.Lo("share_again");
        final DataSource dataSource = (DataSource) ((Map) this.LL.LLJJ.getValue()).get("share_again");
        if (dataSource == null) {
            this.LL.So(jCurrentTimeMillis, "repeated_sending", this.LLILLJJLI, "not_shown", "gecko_data_source_null");
            Unit unit5 = Unit.LIZ;
            C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showShowAgain$1");
            return unit5;
        }
        IDMGeckoCommonChannelManager iDMGeckoCommonChannelManager = (IDMGeckoCommonChannelManager) PluggableExtentionKt.pluggableSpi$default(IDMGeckoCommonChannelManager.class, false, false, false, 14, null);
        if (iDMGeckoCommonChannelManager != null && (strLJII = iDMGeckoCommonChannelManager.LJII()) != null) {
            C259800zU c259800zU = new C259800zU();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJII);
            String str2 = File.separator;
            sbLIZ.append(str2);
            sbLIZ.append("share_again");
            sbLIZ.append(str2);
            sbLIZ.append("display_text");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            File[] fileArrListFiles = new C0VSJ(strLIZIZ).listFiles();
            if (fileArrListFiles != 0) {
                EasterEggForShareAssem easterEggForShareAssem = this.LL;
                for (?? r1 : fileArrListFiles) {
                    easterEggForShareAssem.getClass();
                    I18nManagerServiceApi i18nManagerServiceApi = (I18nManagerServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nManagerServiceApi.class, false, false, false, 14, null);
                    if (i18nManagerServiceApi == null || (strLJIILJJIL = i18nManagerServiceApi.LJIILJJIL(easterEggForShareAssem.getContext())) == null) {
                        strLJIILJJIL = "default";
                    }
                    if (u.LJJIIJZLJL(r1.getName(), strLJIILJJIL, false) && u.LJIIZILJ(r1.getName(), ".png", false)) {
                        c259800zU.element = r1;
                    }
                }
            }
            if (c259800zU.element == 0) {
                File[] fileArrListFiles2 = new C0VSJ(strLIZIZ).listFiles();
                if (fileArrListFiles2 != 0) {
                    int length = fileArrListFiles2.length;
                    for (int i = 0; i < length; i++) {
                        t = fileArrListFiles2[i];
                        if (Intrinsics.LJFF(t.getPath(), "default.png")) {
                            break;
                        }
                    }
                    t = 0;
                    c259800zU.element = t;
                } else {
                    t = 0;
                    c259800zU.element = t;
                }
            }
            File file = (File) c259800zU.element;
            if (file != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.outWidth = 1170;
                options.outHeight = 186;
                final Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                if (bitmapDecodeFile != null) {
                    if (((Boolean) C0BQP.LIZ.getValue()).booleanValue()) {
                        VideoCoverComponent videoCoverComponent = this.LLILLL.LJI;
                        if (videoCoverComponent != null && (imageComponent = videoCoverComponent.coverImage) != null && (list = imageComponent.urls) != null) {
                            str = (String) C13LP.LJJJLL(list);
                        } else {
                            str = null;
                        }
                    } else {
                        str = this.LLILLL.LJIIJ;
                    }
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str));
                    final EasterEggForShareAssem easterEggForShareAssem2 = this.LL;
                    final String str3 = this.LLILLJJLI;
                    final List<String> list2 = this.LLILZ;
                    c1331670kl3LJIIIIZZ.LJJII(new InterfaceC1331910klR() { // from class: X.169z
                        @Override // X.InterfaceC1331910klR
                        public final void onProgress(float f) {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onCanceled() {
                            easterEggForShareAssem2.So(jCurrentTimeMillis, "repeated_sending", str3, "not_shown", "cover_bitmap_canceled");
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            if (bitmap == null) {
                                easterEggForShareAssem2.So(jCurrentTimeMillis, "repeated_sending", str3, "not_shown", "cover_bitmap_null");
                                return;
                            }
                            EasterEggForShareAssem easterEggForShareAssem3 = easterEggForShareAssem2;
                            Context context2 = context;
                            easterEggForShareAssem3.getClass();
                            float f = context2.getResources().getDisplayMetrics().density * 16.0f;
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 378, 514, true);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            Paint paint = new Paint();
                            paint.setAntiAlias(true);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            paint.setShader(new BitmapShader(bitmapCreateScaledBitmap, tileMode, tileMode));
                            canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight()), f, f, paint);
                            IAnimationQueueManager iAnimationQueueManager = (IAnimationQueueManager) easterEggForShareAssem2.LLJILLL.getValue();
                            if (iAnimationQueueManager != null) {
                                iAnimationQueueManager.enqueue(new AwS1S1500100_31(dataSource, (DataSource) easterEggForShareAssem2, (EasterEggForShareAssem) bitmapDecodeFile, bitmapCreateBitmap, (Bitmap) str3, (String) jCurrentTimeMillis, (long) list2, (List<String>) 0), new AwS432S0200000_31(dataSource, easterEggForShareAssem2, 29), C06XH.CI_EXPLOSION_EFFECT_ANIMATION, null, true, false, 10000L, C1751606tW.LIZ);
                            }
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("load bitmap failed ");
                            sbLIZ2.append(th);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            easterEggForShareAssem2.So(jCurrentTimeMillis, "repeated_sending", str3, "not_shown", "cover_bitmap_load_failed");
                        }
                    });
                    Unit unit6 = Unit.LIZ;
                    C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showShowAgain$1");
                    return unit6;
                }
            }
            this.LL.So(jCurrentTimeMillis, "repeated_sending", this.LLILLJJLI, "not_shown", "text_bitmap_null");
            Unit unit7 = Unit.LIZ;
            C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showShowAgain$1");
            return unit7;
        }
        this.LL.So(jCurrentTimeMillis, "repeated_sending", this.LLILLJJLI, "not_shown", "gecko_dir_null");
        Unit unit8 = Unit.LIZ;
        C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showShowAgain$1");
        return unit8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
