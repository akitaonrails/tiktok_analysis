package Y;

import X.C0J01;
import X.C0KX8;
import X.C0UFE;
import X.C13LP;
import X.C497410Jf1;
import X.EnumC1102750enp;
import X.InterfaceC1103130eoR;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class AObjectS189S0300000_7 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS189S0300000_7 aObjectS189S0300000_7, Object obj) {
        C497410Jf1 c497410Jf1 = (C497410Jf1) aObjectS189S0300000_7.l0;
        DataChannel dataChannel = (DataChannel) aObjectS189S0300000_7.l1;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aObjectS189S0300000_7.l2;
        C0UFE c0ufe = (C0UFE) obj;
        c497410Jf1.LLILZ = c0ufe;
        C0KX8 c0kx8 = (C0KX8) dataChannel.gg0(LiveBanCapabilityChannel.class);
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            if ((c0ufe != C0UFE.ON && room.cppVersion == 1) || (c0kx8 != null && c0kx8.LIZIZ)) {
                interfaceC1103130eoR.setAlpha(0.34f);
                return null;
            }
            interfaceC1103130eoR.setAlpha(1.0f);
            EnumC1102750enp.INTRO.setRedDotVisible(dataChannel, false);
            return null;
        }
        return null;
    }

    public static final Object invoke$1(AObjectS189S0300000_7 aObjectS189S0300000_7, Object obj) {
        SurveyOption surveyOption;
        PreviewSurveyViewModel surveyViewModel;
        SurveyData surveyData;
        int iIntValue = ((Number) obj).intValue();
        List<SurveyOption> list = ((SurveyQuestion) aObjectS189S0300000_7.l0).optionList;
        if (list != null && (surveyOption = (SurveyOption) C13LP.LJJJLZIJ(iIntValue - 1, list)) != null && !Intrinsics.LJFF(((PreviewSurveyViewModel) aObjectS189S0300000_7.l1).LLILLL, surveyOption)) {
            PreviewSurveyViewModel previewSurveyViewModel = (PreviewSurveyViewModel) aObjectS189S0300000_7.l1;
            previewSurveyViewModel.LLILLL = surveyOption;
            previewSurveyViewModel.LLILZ.add(surveyOption);
            List<SurveySecondQuestion> list2 = surveyOption.secondList;
            if (list2 != null && !list2.isEmpty() && (surveyViewModel = ((C0J01) aObjectS189S0300000_7.l2).getSurveyViewModel()) != null && (surveyData = surveyViewModel.LL) != null && surveyData.surveyVersion == 5) {
                ((C0J01) aObjectS189S0300000_7.l2).s0();
            } else {
                ((C0J01) aObjectS189S0300000_7.l2).u0();
            }
        }
        return Unit.LIZ;
    }

    public AObjectS189S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
