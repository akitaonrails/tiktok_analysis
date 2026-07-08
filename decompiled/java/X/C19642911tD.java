package X;

import android.content.res.Resources;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.11tD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.addyours.RecordAddYoursStickerComponent$showAyTopicPostCountGuideByTopic$1", f = "RecordAddYoursStickerComponent.kt", l = {540}, m = "invokeSuspend")
public final class C19642911tD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C390150FRl LLILLJJLI;
    public final /* synthetic */ C1647720syo LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19642911tD(C390150FRl c390150FRl, C1647720syo c1647720syo, String str, InterfaceC1364105Vn<? super C19642911tD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c390150FRl;
        this.LLILLL = c1647720syo;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19642911tD(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        boolean z;
        InterfaceC1647520syU infiniStickerApi;
        int i;
        String strJ4;
        Long topicId;
        Long videoCount;
        Object objLJIIJ = obj;
        C1C7U.LIZ("RecordAddYoursStickerComponent@8021.showAyTopicPostCountGuideByTopic$1");
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
            String topicText = this.LLILLJJLI.LJLI().getTopicText();
            if (topicText == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RecordAddYoursStickerComponent@8021.showAyTopicPostCountGuideByTopic$1");
                return unit;
            }
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            this.LL = 1;
            objLJIIJ = c19651011uW.LJIIJ(topicText, this);
            if (objLJIIJ == objLJFF) {
                C1C7U.LIZIZ("RecordAddYoursStickerComponent@8021.showAyTopicPostCountGuideByTopic$1");
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
        InterfaceC1647520syU infiniStickerApi2 = this.LLILLL.getInfiniStickerApi();
        if (infiniStickerApi2 != null) {
            AddYoursStickerModel addYoursStickerModelLJLI = this.LLILLJJLI.LJLI();
            if (addYoursStickerStruct != null) {
                topicId = addYoursStickerStruct.getTopicId();
            } else {
                topicId = null;
            }
            infiniStickerApi2.J4(addYoursStickerModelLJLI.copy(addYoursStickerModelLJLI.baseStickerModel, topicId, addYoursStickerModelLJLI.topicText, addYoursStickerModelLJLI.topicTextFromRecommendTopicList, addYoursStickerModelLJLI.visible, addYoursStickerModelLJLI.editable, addYoursStickerModelLJLI.clickable, addYoursStickerModelLJLI.addYoursInvitees, addYoursStickerModelLJLI.addYoursEnterMethod, addYoursStickerModelLJLI.isOperationSet, addYoursStickerModelLJLI.fontSize, addYoursStickerModelLJLI.topicType, addYoursStickerModelLJLI.followTopicText, addYoursStickerModelLJLI.followTopicId, addYoursStickerModelLJLI.needRemindUserCanChangeTopic, addYoursStickerModelLJLI.isEdited, addYoursStickerModelLJLI.sourceOfTrendsAddYoursInVideo, addYoursStickerModelLJLI.isCandidateState, addYoursStickerModelLJLI.initialRecommendTopicByContent, addYoursStickerModelLJLI.videoCount, addYoursStickerModelLJLI.isSelectedAddYours, addYoursStickerModelLJLI.recommendAyInitialScale));
        }
        AddYoursStickerModel addYoursStickerModelLJLI2 = this.LLILLJJLI.LJLI();
        if (this.LLILLL.getShortVideoContext().mIsFromDraft && C123100dR.LIZ(addYoursStickerModelLJLI2.getTopicText()) && addYoursStickerModelLJLI2.isFollowAndModifyTopic()) {
            addYoursStickerModelLJLI2.setAddYoursInvitees(null);
        }
        if (C123100dR.LIZ(this.LLILLJJLI.LJLI().getTopicText()) && !Intrinsics.LJFF(this.LLILLJJLI.LJLI().getTopicText(), this.LLILZ) && (infiniStickerApi = this.LLILLL.getInfiniStickerApi()) != null) {
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
            infiniStickerApi.LJ0(true, strJ4, this.LLILLJJLI, null, null, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecordAddYoursStickerComponent@8021.showAyTopicPostCountGuideByTopic$1");
        return unit2;
    }
}
