package X;

import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C390220FRs extends C2217421BqW implements Function1<Integer, Unit> {
    public C390220FRs(Object obj) {
        super(1, obj, C388960FMw.class, "onAYClick", "onAYClick(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue;
        int iIntValue2 = num.intValue();
        C388960FMw c388960FMw = (C388960FMw) this.receiver;
        c388960FMw.LIZJ.LJIIJJI.LIZ.invoke();
        AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText addYoursAutoSuggestTopicForText = (AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText) C13LP.LJJJLZIJ(iIntValue2, c388960FMw.LJI);
        if (addYoursAutoSuggestTopicForText != null) {
            InterfaceC390170FRn interfaceC390170FRn = c388960FMw.LIZJ.LJI;
            if (interfaceC390170FRn != null) {
                String topicText = c388960FMw.LJFF.LIZ.getTopicText();
                String str = "";
                if (topicText == null) {
                    topicText = "";
                }
                String str2 = addYoursAutoSuggestTopicForText.text;
                if (str2 == null) {
                    str2 = "";
                }
                String value = C0FS4.TITLE.getValue();
                boolean z = C0FS1.LLJJIJIIJIL;
                String addYoursEnterMethod = c388960FMw.LJFF.LIZ.getAddYoursEnterMethod();
                if (addYoursEnterMethod != null) {
                    str = addYoursEnterMethod;
                }
                Integer num2 = addYoursAutoSuggestTopicForText.type;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                interfaceC390170FRn.LJIILIIL(iIntValue, topicText, str2, value, str, z);
            }
            C390250FRv c390250FRv = c388960FMw.LIZJ;
            c390250FRv.LJIIJ = C0FS5.AUTO;
            c390250FRv.LJIIIIZZ = String.valueOf(addYoursAutoSuggestTopicForText.text);
            c388960FMw.LJFF.LIZLLL(new AwS584S0100000_5(addYoursAutoSuggestTopicForText, 150), true);
        }
        return Unit.LIZ;
    }
}
