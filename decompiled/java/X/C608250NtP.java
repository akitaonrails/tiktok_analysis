package X;

import android.content.Context;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursInfoStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NtP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608250NtP extends C09AY implements InterfaceC1631620sYq<AddYoursStickerStruct, Boolean, Boolean, Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ C0NNI LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ AddYoursEntranceButtonAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C608250NtP(Aweme aweme, C0NNI c0nni, C19EG c19eg, AddYoursEntranceButtonAssem addYoursEntranceButtonAssem) {
        super(3);
        this.LL = aweme;
        this.LLILLJJLI = c0nni;
        this.LLILLL = c19eg;
        this.LLILZ = addYoursEntranceButtonAssem;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(AddYoursStickerStruct addYoursStickerStruct, Boolean bool, Boolean bool2) {
        String str;
        Integer videoSource;
        Object obj;
        AddYoursStickerStruct addYoursStickerStruct2 = addYoursStickerStruct;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        if (addYoursStickerStruct2 != null) {
            Aweme aweme = this.LL;
            C0NNI c0nni = this.LLILLJJLI;
            C19EG c19eg = this.LLILLL;
            AddYoursEntranceButtonAssem addYoursEntranceButtonAssem = this.LLILZ;
            if (zBooleanValue) {
                str = "add_yours";
            } else {
                str = "trend_button";
            }
            String strValueOf = String.valueOf(AwemeExtKt.getFollowStatus(aweme));
            Integer num = c0nni.LLILLL;
            boolean z = c0nni instanceof C0NNH;
            AddYoursInfoStruct addYoursInfoStruct = aweme.getAddYoursInfoStruct();
            Object obj2 = null;
            if (addYoursInfoStruct != null) {
                videoSource = addYoursInfoStruct.getVideoSource();
            } else {
                videoSource = null;
            }
            C19651011uW.LIZIZ.LIZLLL(c19eg, aweme, new AddYourRecordParam(addYoursStickerStruct2, false, false, "personal_homepage", str, "add_yours_bottom_button", strValueOf, zBooleanValue2, zBooleanValue, null, null, num, Integer.valueOf(z ? 1 : 0), null, null, null, null, null, false, false, null, videoSource, null, null, null, true, false));
            AddYoursEntranceButtonVM addYoursEntranceButtonVMEp = addYoursEntranceButtonAssem.Ep();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(addYoursEntranceButtonAssem);
            Context context = addYoursEntranceButtonAssem.getContext();
            C724270Sb3 c724270Sb3 = addYoursEntranceButtonAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            addYoursEntranceButtonVMEp.wQ2(interfaceC665370Q7zLJIIL, context, "add_yours_bottom_button_click", (VideoItemParams) obj);
            AddYoursEntranceButtonVM addYoursEntranceButtonVMEp2 = addYoursEntranceButtonAssem.Ep();
            C724270Sb3 c724270Sb32 = addYoursEntranceButtonAssem.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            addYoursEntranceButtonVMEp2.xQ2((VideoItemParams) obj2, "trend_button_click");
        } else {
            Aweme aweme2 = this.LL;
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cannot get valid add yours for aweme, aid=");
            sbLIZ.append(aweme2.getAid());
            c2276471E8n.LIZIZ("common_feed", "AddYoursEntranceButtonAssem", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }
}
