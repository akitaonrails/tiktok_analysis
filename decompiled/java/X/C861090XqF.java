package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.toolbar.impl.EditToolbarStickerHandler$showDMGroupChatPromote$1", f = "Sticker.kt", l = {150}, m = "invokeSuspend")
public final class C861090XqF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1462880oAg LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861090XqF(C1462880oAg c1462880oAg, boolean z, Function0<Unit> function0, InterfaceC1364105Vn<? super C861090XqF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1462880oAg;
        this.LLILLL = z;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861090XqF(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditToolbarStickerHandler@e7af.showDMGroupChatPromote$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IGroupChatStickerApi iGroupChatStickerApi = (IGroupChatStickerApi) PluggableExtentionKt.pluggableSpi$default(IGroupChatStickerApi.class, false, false, false, 14, null);
            if (iGroupChatStickerApi != null) {
                boolean zLJIIZILJ = u4.LJIIZILJ(this.LLILLJJLI.LIZJ());
                this.LL = 1;
                obj = iGroupChatStickerApi.LIZ(zLJIIZILJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EditToolbarStickerHandler@e7af.showDMGroupChatPromote$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EditToolbarStickerHandler@e7af.showDMGroupChatPromote$1");
            return unit;
        }
        C0V03 c0v03 = (C0V03) obj;
        if (c0v03 != null && c0v03.LIZ) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C861110XqH(this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 3);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditToolbarStickerHandler@e7af.showDMGroupChatPromote$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
