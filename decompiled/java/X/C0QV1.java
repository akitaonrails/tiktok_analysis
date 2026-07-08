package X;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem;
import com.ss.android.ugc.aweme.search.model.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QV1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QV1 extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ Image LL;
    public final /* synthetic */ GeneralVerticalSkinAssem LLILLJJLI;
    public final /* synthetic */ SmartImageView LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C0QLM LLIZ;
    public final /* synthetic */ View LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QV1(Image image, GeneralVerticalSkinAssem generalVerticalSkinAssem, SmartImageView smartImageView, C19EG c19eg, View view, boolean z, C0QLM c0qlm, View view2) {
        super(1);
        this.LL = image;
        this.LLILLJJLI = generalVerticalSkinAssem;
        this.LLILLL = smartImageView;
        this.LLILZ = c19eg;
        this.LLILZIL = view;
        this.LLILZLL = z;
        this.LLIZ = c0qlm;
        this.LLIZLLLIL = view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(android.graphics.Bitmap r15) {
        /*
            r14 = this;
            r2 = r15
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto La1
            com.ss.android.ugc.aweme.search.model.Image r0 = r14.LL
            java.lang.Integer r0 = r0.getImageWidth()
            if (r0 == 0) goto Lc0
            int r5 = r0.intValue()
        L11:
            com.ss.android.ugc.aweme.search.model.Image r0 = r14.LL
            java.lang.Integer r0 = r0.getImageHeight()
            if (r0 == 0) goto Lba
            int r6 = r0.intValue()
        L1d:
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem r0 = r14.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinViewModel r0 = r0.So()
            X.002o r0 = r0.getState()
            X.0QV6 r0 = (X.C0QV6) r0
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem r0 = r14.LLILLJJLI
            android.view.View r0 = r0.LJJIJL()
            r0.getWidth()
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem r0 = r14.LLILLJJLI
            X.0Q4X r0 = r0.Lo()
            r13 = 0
            if (r0 == 0) goto Lb8
            X.0Q7B r1 = r0.LLILZLL
        L3d:
            X.0Q7B r0 = X.C0Q7B.SIMPLIFIED
            if (r1 != r0) goto Lab
            boolean r0 = X.C0QV7.LIZ()
            if (r0 != 0) goto Lab
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem r1 = r14.LLILLJJLI
            com.bytedance.lighten.loader.SmartImageView r3 = r14.LLILLL
            X.19EG r4 = r14.LLILZ
            android.view.View r7 = r14.LLILZIL
            r1.Jo(r2, r3, r4, r5, r6, r7)
        L52:
            android.view.View r9 = r14.LLILZIL
            if (r9 == 0) goto L60
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem r7 = r14.LLILLJJLI
            X.19EG r10 = r14.LLILZ
            r8 = r2
            r11 = r5
            r12 = r6
            r7.Go(r8, r9, r10, r11, r12, r13)
        L60:
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem r0 = r14.LLILLJJLI
            X.01GW r0 = r0.LLJILJIL
            java.lang.Object r4 = r0.getValue()
            android.view.View r4 = (android.view.View) r4
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem r0 = r14.LLILLJJLI
            android.content.Context r3 = r0.getContext()
            boolean r2 = r14.LLILZLL
            X.0QLM r0 = r14.LLIZ
            android.view.View r1 = r14.LLIZLLLIL
            if (r4 == 0) goto L8c
            if (r3 == 0) goto L8c
            if (r2 == 0) goto La4
            com.ss.android.ugc.aweme.search.model.ThemeColor r0 = r0.LIZLLL
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.dark
        L82:
            if (r0 == 0) goto L8c
            X.C2469809m4.LIZIZ(r4, r0)
            if (r1 == 0) goto L8c
            X.C2469809m4.LIZIZ(r1, r0)
        L8c:
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem r0 = r14.LLILLJJLI
            X.0Q7z r1 = X.C1558520qew.LJIIL(r0)
            java.lang.Class<com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility> r0 = com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility.class
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r13)
            com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility r1 = (com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility) r1
            if (r1 == 0) goto La1
            boolean r0 = r14.LLILZLL
            r1.BF2(r0)
        La1:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La4:
            com.ss.android.ugc.aweme.search.model.ThemeColor r0 = r0.LIZLLL
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.light
            goto L82
        Lab:
            com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem r7 = r14.LLILLJJLI
            com.bytedance.lighten.loader.SmartImageView r9 = r14.LLILLL
            X.19EG r10 = r14.LLILZ
            r8 = r2
            r11 = r5
            r12 = r6
            r7.Go(r8, r9, r10, r11, r12, r13)
            goto L52
        Lb8:
            r1 = r13
            goto L3d
        Lba:
            int r6 = r2.getHeight()
            goto L1d
        Lc0:
            int r5 = r2.getWidth()
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QV1.invoke(java.lang.Object):java.lang.Object");
    }
}
