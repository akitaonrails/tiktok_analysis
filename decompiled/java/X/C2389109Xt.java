package X;

import com.ss.android.ugc.aweme.creative.model.SocialAvatarUpdateInfoStruct;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Xt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.text.SocialStickerInitHelper$initSticker$3", f = "SocialStickerInitHelper.kt", l = {66}, m = "invokeSuspend")
public final class C2389109Xt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2389209Xu LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2389109Xt(C2389209Xu c2389209Xu, InterfaceC1364105Vn<? super C2389109Xt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2389209Xu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2389109Xt c2389109Xt = new C2389109Xt(this.LLILLL, interfaceC1364105Vn);
        c2389109Xt.LLILLJJLI = obj;
        return c2389109Xt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2389209Xu c2389209Xu;
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        C1C7U.LIZ("SocialStickerInitHelper@8137.initSticker$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                c2389209Xu = (C2389209Xu) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
            C2389209Xu c2389209Xu2 = this.LLILLL;
            c2389209Xu2.LLILZIL = ((InterfaceC1455860nzM) c2389209Xu2.LLILZ.getValue(c2389209Xu2, C2389209Xu.LLILZLL[2])).g().getValue();
            c2389209Xu = this.LLILLL;
            InterfaceC1452170ntP interfaceC1452170ntP = c2389209Xu.LLILZIL;
            if (interfaceC1452170ntP != null) {
                C2388309Xl c2388309Xl = C2388309Xl.LIZ;
                SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStruct = c2389209Xu.LIZ().creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct;
                this.LLILLJJLI = c2389209Xu;
                this.LL = 1;
                obj = C2388309Xl.LIZIZ(c2388309Xl, interfaceC497601wk, interfaceC1635410sexLIZ, interfaceC1452170ntP, socialAvatarUpdateInfoStruct, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialStickerInitHelper@8137.initSticker$3");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialStickerInitHelper@8137.initSticker$3");
            return unit;
        }
        if (obj != null && (infoStickerModel = c2389209Xu.LIZ().getInfoStickerModel()) != null && (list = infoStickerModel.stickers) != null) {
            Boolean.valueOf(list.add((StickerItemModel) obj));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialStickerInitHelper@8137.initSticker$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
