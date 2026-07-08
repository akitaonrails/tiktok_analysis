package X;

import android.content.Context;
import android.graphics.Point;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11tA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19642611tA extends C2217421BqW implements Function1<Integer, Unit> {
    public C19642611tA(C890630Ywn c890630Ywn) {
        super(1, c890630Ywn, C890630Ywn.class, "clickItem", "clickItem(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int i;
        AddYoursStickerModel addYoursStickerModelCopy;
        int iIntValue = num.intValue();
        C890630Ywn c890630Ywn = (C890630Ywn) this.receiver;
        c890630Ywn.getClass();
        boolean zLJI = MethodIDManager.LJI(196712);
        if (iIntValue >= c890630Ywn.LIZIZ().LLLFZ().size()) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            C0M2U c0m2u = C0M2U.LIZ;
            VideoPublishEditModel videoPublishEditModelLIZJ = c890630Ywn.LIZJ();
            c0m2u.getClass();
            String topicText = null;
            C0M2U.LIZ(videoPublishEditModelLIZJ, "add_yours", null);
            String str = ((AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText) ListProtector.get(c890630Ywn.LIZIZ().LLLFZ(), iIntValue)).text;
            if (str == null) {
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            } else {
                AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) C13LP.LJJJLL(c890630Ywn.LIZJ().creativeModel.stickerModel.addYoursStickerModels);
                if (addYoursStickerModel != null) {
                    addYoursStickerModelCopy = addYoursStickerModel.copy(addYoursStickerModel.baseStickerModel, addYoursStickerModel.topicID, str, str, addYoursStickerModel.visible, addYoursStickerModel.editable, addYoursStickerModel.clickable, addYoursStickerModel.addYoursInvitees, "post_page_text_entrance", addYoursStickerModel.isOperationSet, addYoursStickerModel.fontSize, addYoursStickerModel.topicType, addYoursStickerModel.followTopicText, addYoursStickerModel.followTopicId, addYoursStickerModel.needRemindUserCanChangeTopic, addYoursStickerModel.isEdited, addYoursStickerModel.sourceOfTrendsAddYoursInVideo, addYoursStickerModel.isCandidateState, addYoursStickerModel.initialRecommendTopicByContent, addYoursStickerModel.videoCount, addYoursStickerModel.isSelectedAddYours, addYoursStickerModel.recommendAyInitialScale);
                } else {
                    C388980FMy c388980FMy = C388980FMy.LIZ;
                    Context context = c890630Ywn.LIZ.getContext();
                    Point point = c890630Ywn.LIZIZ;
                    AddYoursStickerModel addYoursStickerModel2 = new AddYoursStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.ADD_YOURS, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), null, str, str, true, false, false, null, "post_page_text_entrance", 0, 14.0f, 0, null, null, false, false, null, false, null, null, true, null);
                    c388980FMy.getClass();
                    C19614411oc c19614411ocLIZIZ = C388980FMy.LIZIZ(context, null, false, false, addYoursStickerModel2, null);
                    c19614411ocLIZIZ.measure(-2, -2);
                    Pair pair = new Pair(Integer.valueOf(c19614411ocLIZIZ.getMeasuredWidth()), Integer.valueOf(c19614411ocLIZIZ.getMeasuredHeight()));
                    int iIntValue2 = ((Number) pair.getFirst()).intValue();
                    C388980FMy.LIZIZ = new Pair<>(Integer.valueOf(iIntValue2), Integer.valueOf(((Number) pair.getSecond()).intValue()));
                    int containerLeft = point.x;
                    if (containerLeft <= 0) {
                        containerLeft = addYoursStickerModel2.getBaseStickerModel().getContainerLeft() + (addYoursStickerModel2.getBaseStickerModel().getContainerWidth() / 2);
                    }
                    int containerTop = point.y;
                    if (containerTop <= 0) {
                        containerTop = addYoursStickerModel2.getBaseStickerModel().getContainerTop() + (addYoursStickerModel2.getBaseStickerModel().getContainerHeight() / 2);
                    }
                    int iLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(34.0f))) + (iIntValue2 / 2)) - containerLeft;
                    if (C426750GoL.LIZLLL(context)) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    addYoursStickerModelCopy = addYoursStickerModel2.copy(BaseStickerModel.copy$default(addYoursStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, iLIZIZ * i, (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(158.0f))) + (r8 / 2)) - containerTop, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -6291457, 15, null), addYoursStickerModel2.topicID, addYoursStickerModel2.topicText, addYoursStickerModel2.topicTextFromRecommendTopicList, true, addYoursStickerModel2.editable, addYoursStickerModel2.clickable, addYoursStickerModel2.addYoursInvitees, addYoursStickerModel2.addYoursEnterMethod, addYoursStickerModel2.isOperationSet, addYoursStickerModel2.fontSize, addYoursStickerModel2.topicType, addYoursStickerModel2.followTopicText, addYoursStickerModel2.followTopicId, addYoursStickerModel2.needRemindUserCanChangeTopic, addYoursStickerModel2.isEdited, addYoursStickerModel2.sourceOfTrendsAddYoursInVideo, addYoursStickerModel2.isCandidateState, addYoursStickerModel2.initialRecommendTopicByContent, addYoursStickerModel2.videoCount, addYoursStickerModel2.isSelectedAddYours, addYoursStickerModel2.recommendAyInitialScale);
                }
                c890630Ywn.LIZJ().creativeModel.stickerModel.addYoursStickerModels.clear();
                c890630Ywn.LIZJ().creativeModel.stickerModel.addYoursStickerModels.add(addYoursStickerModelCopy);
                C434710H2v c434710H2vLIZIZ = c890630Ywn.LIZIZ();
                c890630Ywn.LIZLLL();
                c434710H2vLIZIZ.setData(c890630Ywn.LIZ());
                int i2 = 0;
                if (((Number) C1402790mbl.LIZ.getValue()).intValue() == 1) {
                    c890630Ywn.LIZLLL.invoke();
                } else {
                    C1389890mGx c1389890mGx = new C1389890mGx(c890630Ywn.LIZ);
                    c1389890mGx.LJIIJ(c890630Ywn.LIZ.getContext().getString(2131825087));
                    c1389890mGx.LJIIJJI();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("new models: ");
                AddYoursStickerModel addYoursStickerModel3 = (AddYoursStickerModel) C13LP.LJJJLL(c890630Ywn.LIZJ().creativeModel.stickerModel.addYoursStickerModels);
                if (addYoursStickerModel3 != null) {
                    topicText = addYoursStickerModel3.getTopicText();
                }
                sbLIZ.append(topicText);
                C2188811AlT.LIZIZ(sbLIZ);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "video_post_page");
                c2344009Gk.LJIIIIZZ("shoot_way", c890630Ywn.LIZJ().mShootWay);
                c2344009Gk.LJIIIIZZ("creation_id", c890630Ywn.LIZJ().getCreationId());
                c2344009Gk.LJIIIIZZ("content_source", C1428470nHB.LJIILIIL(c890630Ywn.LIZJ()));
                c2344009Gk.LJIIIIZZ("content_type", C1428470nHB.LJIILL(c890630Ywn.LIZJ()));
                c2344009Gk.LJIIIIZZ("add_yours_enter_method", "post_page_text_entrance");
                c2344009Gk.LJIIIIZZ("add_yours_title", str);
                Iterator<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText> it2 = c890630Ywn.LIZLLL().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().text, str)) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                c2344009Gk.LIZJ(i2 + 1, "add_yours_position");
                C20684815ws.LJIILLIIL("click_text_page_add_yours_icon", c2344009Gk.LIZ);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }
        }
        return Unit.LIZ;
    }
}
