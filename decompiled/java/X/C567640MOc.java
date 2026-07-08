package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.MusicMemeSongParser$prepareMusicShareStoryResource$1$coverTask$1", f = "MusicMemeSongParser.kt", l = {246}, m = "invokeSuspend")
public final class C567640MOc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ MusicShareStoryInputData LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ C259800zU<MusicShareStoryData> LLILZIL;
    public final /* synthetic */ C0MOZ LLILZLL;
    public final /* synthetic */ C0MOV LLIZ;
    public final /* synthetic */ C259800zU<String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567640MOc(MusicShareStoryInputData musicShareStoryInputData, Context context, C259800zU<MusicShareStoryData> c259800zU, C0MOZ c0moz, C0MOV c0mov, C259800zU<String> c259800zU2, InterfaceC1364105Vn<? super C567640MOc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = musicShareStoryInputData;
        this.LLILZ = context;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c0moz;
        this.LLIZ = c0mov;
        this.LLIZLLLIL = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567640MOc(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicMemeSongParser@d5b5.prepareMusicShareStoryResource$1$coverTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            MusicShareStoryInputData musicShareStoryInputData = this.LLILLL;
            Context context = this.LLILZ;
            final C259800zU<MusicShareStoryData> c259800zU = this.LLILZIL;
            final C0MOZ c0moz = this.LLILZLL;
            final C0MOV c0mov = this.LLIZ;
            final C259800zU<String> c259800zU2 = this.LLIZLLLIL;
            this.LL = context;
            this.LLILLJJLI = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            if (musicShareStoryInputData != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(musicShareStoryInputData.getCoverUrl()));
                c1331670kl3LJIIIIZZ.LJJIJL(context);
                c1331670kl3LJIIIIZZ.LIZLLL("MusicShareStoryParser");
                c1331670kl3LJIIIIZZ.LJJII(new AbstractC468201s0() { // from class: X.0MOe
                    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.ss.android.ugc.aweme.creative.model.MusicShareStoryData] */
                    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.String] */
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) throws Throwable {
                        if (bitmap == null) {
                            InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                            Unit unit = Unit.LIZ;
                            C189200o6.m2constructorimpl(unit);
                            interfaceC20236714Gf.resumeWith(unit);
                        }
                        C259800zU<MusicShareStoryData> c259800zU3 = c259800zU;
                        if (bitmap != null) {
                            c259800zU3.element = C20518215Qm.LIZ(bitmap);
                            c0moz.LIZIZ = new Pair<>(Integer.valueOf(c259800zU.element.getBgStartColor()), Integer.valueOf(c259800zU.element.getBgEndColor()));
                            InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
                            CreativeInfo creativeInfoLIZ = c0mov.LIZ();
                            EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.SHARE_T0_STORY;
                            String strLIZLLL = C2298208zU.LIZLLL(pathService, creativeInfoLIZ, enumC20228214Cy, null, false, 12);
                            c259800zU2.element = new C0VSJ(strLIZLLL, "music_cover.jpg").getPath();
                            C2477909nN.LJI(bitmap, c259800zU2.element, Bitmap.CompressFormat.JPEG, 0, 4);
                            String path = new C0VSJ(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), c0mov.LIZ(), enumC20228214Cy, null, false, 12), "source.png").getPath();
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(540, 960, Bitmap.Config.ARGB_8888);
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 960.0f, c259800zU.element.getBgStartColor(), c259800zU.element.getBgEndColor(), Shader.TileMode.CLAMP);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            Paint paint = new Paint();
                            paint.setAntiAlias(true);
                            paint.setShader(linearGradient);
                            canvas.drawRect(0.0f, 0.0f, 540.0f, 960.0f, paint);
                            C2477909nN.LJI(bitmapCreateBitmap, path, Bitmap.CompressFormat.PNG, 0, 4);
                            c0moz.LIZ = path;
                            InterfaceC20236714Gf<Unit> interfaceC20236714Gf2 = c2252611DEt;
                            Unit unit2 = Unit.LIZ;
                            C189200o6.m2constructorimpl(unit2);
                            interfaceC20236714Gf2.resumeWith(unit2);
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                        Unit unit = Unit.LIZ;
                        C189200o6.m2constructorimpl(unit);
                        interfaceC20236714Gf.resumeWith(unit);
                    }
                });
                Object objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("MusicMemeSongParser@d5b5.prepareMusicShareStoryResource$1$coverTask$1");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicMemeSongParser@d5b5.prepareMusicShareStoryResource$1$coverTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
