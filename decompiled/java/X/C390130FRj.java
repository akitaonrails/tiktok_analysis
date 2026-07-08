package X;

import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C390130FRj extends C2217421BqW implements Function1<Integer, Unit> {
    public C390130FRj(Object obj) {
        super(1, obj, C0FLW.class, "onClickAYItem", "onClickAYItem(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        C0FTJ c0ftj;
        C0FF8 c0ff8;
        int iIntValue = num.intValue();
        C0FLW c0flw = (C0FLW) this.receiver;
        AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText addYoursAutoSuggestTopicForText = (AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText) C13LP.LJJJLZIJ(iIntValue, c0flw.LJIIIZ);
        if (addYoursAutoSuggestTopicForText != null) {
            Function1<EnumC1466150oFx, List<C0FTJ<StickerModel>>> function1 = C390410FSl.LIZ(c0flw.LIZJ.LIZ).LJ;
            EnumC1466150oFx enumC1466150oFx = EnumC1466150oFx.ADD_YOURS;
            List<C0FTJ<StickerModel>> listInvoke = function1.invoke(enumC1466150oFx);
            StickerModel stickerModelLJLI = null;
            if (listInvoke != null) {
                c0ftj = (C0FTJ) C13LP.LJJJLZIJ(0, listInvoke);
            } else {
                c0ftj = null;
            }
            C388200FJy c388200FJy = c0flw.LIZJ;
            InterfaceC390170FRn interfaceC390170FRn = c388200FJy.LJI;
            c388200FJy.LJIIL.LJI.invoke();
            if (c0ftj != null) {
                stickerModelLJLI = c0ftj.LJLI();
            }
            if ((stickerModelLJLI instanceof AddYoursStickerModel) && stickerModelLJLI != null) {
                AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) stickerModelLJLI;
                String str = addYoursAutoSuggestTopicForText.text;
                C390410FSl.LIZ(c0flw.LIZJ.LIZ).LIZJ.invoke(addYoursStickerModel.copy(addYoursStickerModel.baseStickerModel, addYoursStickerModel.topicID, str, str, addYoursStickerModel.visible, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, "edit_page_text_entrance", addYoursStickerModel.isOperationSet, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale));
            } else {
                BaseStickerModel baseStickerModel = new BaseStickerModel(0, 0, enumC1466150oFx, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, 2139095035, 15, null);
                String str2 = addYoursAutoSuggestTopicForText.text;
                C390410FSl.LIZ(c0flw.LIZJ.LIZ).LIZIZ.invoke(new AddYoursStickerModel(baseStickerModel, null, str2, str2, true, false, false, null, "edit_page_text_entrance", 0, 14.0f, 0, null, null, false, false, null, false, null, null, true, null));
            }
            String str3 = addYoursAutoSuggestTopicForText.text;
            if (str3 != null && interfaceC390170FRn != null) {
                interfaceC390170FRn.LJIIJJI(iIntValue + 1, str3);
            }
            C388200FJy c388200FJy2 = c0flw.LIZJ;
            if (c388200FJy2.LJIIIZ.LJJIFFI && (c0ff8 = c388200FJy2.LJFF) != null) {
                c0ff8.LJFF(c388200FJy2.LJ.LIZ.getFontModel(), c0flw.LIZJ.LJ.LIZ.getColor(), c0flw.LIZJ.LJ.LIZ.getMode());
            }
        }
        return Unit.LIZ;
    }
}
