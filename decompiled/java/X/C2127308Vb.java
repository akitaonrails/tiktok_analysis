package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Vb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiViewModel$onCleared$1", f = "BulletinEmojiViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2127308Vb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinEmojiViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2127308Vb(BulletinEmojiViewModel bulletinEmojiViewModel, InterfaceC1364105Vn<? super C2127308Vb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinEmojiViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2127308Vb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinEmojiViewModel@98a0.onCleared$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C08Q6 c08q6 = C08Q6.LIZ;
        LinkedList<String> linkedListVQ2 = this.LL.vQ2();
        Object value = this.LL.LLILZ.getValue();
        c08q6.getClass();
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BULLETIN_RECENTLY_EMOJI");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C810670Vr7.LIZJ(contextLIZ, 0, C2188811AlT.LIZIZ(sbLIZ)).edit().putString("emojis", C13LP.LJJLIIIJ(linkedListVQ2, " ", null, null, 0, null, null, 62)).putString("multi_color_emojis", GsonProtectorUtils.toJson(C09EF.LIZ, value)).apply();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinEmojiViewModel@98a0.onCleared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
