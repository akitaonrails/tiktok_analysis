package X;

import android.content.res.Resources;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.11tB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.addyours.ImageEditAddYoursStickerComponent$showAyTopicPostCountGuideByTopic$1", f = "ImageEditAddYoursStickerComponent.kt", l = {235}, m = "invokeSuspend")
public final class C19642711tB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AddYoursStickerModel LLILLJJLI;
    public final /* synthetic */ C19643111tF LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19642711tB(AddYoursStickerModel addYoursStickerModel, C19643111tF c19643111tF, String str, InterfaceC1364105Vn<? super C19642711tB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = addYoursStickerModel;
        this.LLILLL = c19643111tF;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19642711tB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        boolean z;
        Long topicId;
        InterfaceC1464960oE2 interfaceC1464960oE2W2;
        int i;
        String strJ4;
        Long videoCount;
        Object objLJIIJ = obj;
        C1C7U.LIZ("ImageEditAddYoursStickerComponent@121c.showAyTopicPostCountGuideByTopic$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(objLJIIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIJ);
            String topicText = this.LLILLJJLI.getTopicText();
            if (topicText == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ImageEditAddYoursStickerComponent@121c.showAyTopicPostCountGuideByTopic$1");
                return unit;
            }
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            this.LL = 1;
            objLJIIJ = c19651011uW.LJIIJ(topicText, this);
            if (objLJIIJ == objLJFF) {
                C1C7U.LIZIZ("ImageEditAddYoursStickerComponent@121c.showAyTopicPostCountGuideByTopic$1");
                return objLJFF;
            }
        }
        AddYoursStickerStruct addYoursStickerStruct = (AddYoursStickerStruct) objLJIIJ;
        if (addYoursStickerStruct != null && (videoCount = addYoursStickerStruct.getVideoCount()) != null) {
            jLongValue = videoCount.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue == 0) {
            z = true;
        } else {
            z = false;
        }
        AddYoursStickerModel addYoursStickerModel = this.LLILLJJLI;
        if (addYoursStickerStruct != null) {
            topicId = addYoursStickerStruct.getTopicId();
        } else {
            topicId = null;
        }
        AddYoursStickerModel addYoursStickerModelCopy = addYoursStickerModel.copy(addYoursStickerModel.baseStickerModel, topicId, addYoursStickerModel.topicText, addYoursStickerModel.topicTextFromRecommendTopicList, addYoursStickerModel.visible, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, addYoursStickerModel.addYoursEnterMethod, addYoursStickerModel.isOperationSet, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale);
        InterfaceC1464960oE2 interfaceC1464960oE2W22 = this.LLILLL.W2();
        if (interfaceC1464960oE2W22 != null) {
            interfaceC1464960oE2W22.J4(addYoursStickerModelCopy);
        }
        if (C1428470nHB.LJJJZ(this.LLILLL.H2()) && C123100dR.LIZ(addYoursStickerModelCopy.getTopicText()) && addYoursStickerModelCopy.isFollowAndModifyTopic()) {
            addYoursStickerModelCopy.setAddYoursInvitees(null);
        }
        if (C123100dR.LIZ(this.LLILLJJLI.getTopicText()) && !Intrinsics.LJFF(this.LLILLJJLI.getTopicText(), this.LLILZ) && (interfaceC1464960oE2W2 = this.LLILLL.W2()) != null) {
            if (z) {
                strJ4 = C1664590tQ1.LJIIIZ(this.LLILLL).getString(2131833183);
            } else {
                Resources resources = C1664590tQ1.LJIIIZ(this.LLILLL).getResources();
                if (jLongValue > 1) {
                    i = 2;
                } else {
                    i = 1;
                }
                strJ4 = C786410Ut5.j4(resources.getQuantityString(2131755297, i), Arrays.copyOf(new Object[]{C1843500y4a.LIZIZ(jLongValue)}, 1));
            }
            interfaceC1464960oE2W2.LLILII(true, strJ4, this.LLILLJJLI.getId(), C0FSX.BOTTOM, null, null, null, null, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditAddYoursStickerComponent@121c.showAyTopicPostCountGuideByTopic$1");
        return unit2;
    }
}
