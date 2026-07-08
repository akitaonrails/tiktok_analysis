package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ngl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.storynote.StoryNotePublishResolver$resolve$1", f = "StoryNotePublishResolver.kt", l = {103, 109, 148}, m = "invokeSuspend")
public final class C1444330ngl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public VideoPublishEditModel LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ User LLILZIL;
    public final /* synthetic */ StoryNoteInfoModel LLILZLL;
    public final /* synthetic */ C1404940mfE LLIZ;
    public final /* synthetic */ CreativeInfo LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1444330ngl(Context context, User user, StoryNoteInfoModel storyNoteInfoModel, C1404940mfE c1404940mfE, CreativeInfo creativeInfo, InterfaceC1364105Vn<? super C1444330ngl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = context;
        this.LLILZIL = user;
        this.LLILZLL = storyNoteInfoModel;
        this.LLIZ = c1404940mfE;
        this.LLIZLLLIL = creativeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1444330ngl(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[LOOP:2: B:32:0x0092->B:260:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x069a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x038a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0279  */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v8, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r25v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v11, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.ArrayList] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1444330ngl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
