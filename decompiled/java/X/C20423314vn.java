package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderCreationSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.bean.TextHeaderBoardTextFontStyleData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.14vn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20423314vn {
    public static AnchorTextHeaderCreationSheetFragment LIZ(DataChannel dataChannel, AnchorTextHeaderViewModel anchorTextHeaderViewModel, boolean z, C01ZA c01za, String str, String str2, boolean z2, int i, AwS610S0100000_31 awS610S0100000_31, AwS575S0100000_31 awS575S0100000_31, AwS575S0100000_31 awS575S0100000_312, boolean z3, int i2) {
        C01F5 c01f5;
        MutableLiveData<List<TextHeaderBoardTextFontStyleData>> mutableLiveData;
        List<TextHeaderBoardTextFontStyleData> value;
        TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData;
        Effect effect;
        String resourceId;
        long j;
        int i3 = i;
        boolean z4 = z2;
        boolean z5 = z3;
        AwS575S0100000_31 awS575S0100000_313 = awS575S0100000_31;
        C01ZA c01za2 = c01za;
        String str3 = str;
        AwS610S0100000_31 awS610S0100000_312 = awS610S0100000_31;
        String str4 = str2;
        String str5 = AnchorTextHeaderCreationSheetFragment._pnsPageId;
        AwS575S0100000_31 awS575S0100000_314 = null;
        if ((i2 & 8) != 0) {
            c01za2 = null;
        }
        String str6 = "";
        if ((i2 & 16) != 0) {
            str3 = "";
        }
        if ((i2 & 32) != 0) {
            str4 = "";
        }
        if ((i2 & 64) != 0) {
            z4 = true;
        }
        if ((i2 & 128) != 0) {
            i3 = 0;
        }
        if ((i2 & 256) != 0) {
            awS610S0100000_312 = null;
        }
        if ((i2 & 512) != 0) {
            awS575S0100000_313 = null;
        }
        if ((i2 & 1024) == 0) {
            awS575S0100000_314 = awS575S0100000_312;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z5 = true;
        }
        if (c01za2 == null || (c01f5 = c01za2.LIZ) == null) {
            if (anchorTextHeaderViewModel != null && (mutableLiveData = anchorTextHeaderViewModel.LLJILLL) != null && (value = mutableLiveData.getValue()) != null && (textHeaderBoardTextFontStyleData = (TextHeaderBoardTextFontStyleData) C13LP.LJJJLL(value)) != null && (effect = textHeaderBoardTextFontStyleData.LIZJ) != null && (resourceId = effect.getResourceId()) != null) {
                str6 = resourceId;
            }
            float fLIZIZ = C972080bP4.LIZIZ(str6);
            if (str6.length() == 0) {
                c01f5 = new C01F5(null, null, 0, false, fLIZIZ, false, 191);
            } else if (!C931810aM7.LIZLLL()) {
                c01f5 = new C01F5(null, str6, 0, false, fLIZIZ, false, 189);
            } else {
                c01f5 = new C01F5(null, str6, 0, false, fLIZIZ, false, 189);
            }
        }
        if (anchorTextHeaderViewModel != null) {
            anchorTextHeaderViewModel.LLJJ.setValue(c01f5);
        }
        if (c01za2 != null) {
            j = c01za2.LIZLLL;
        } else {
            j = 0;
        }
        return new AnchorTextHeaderCreationSheetFragment(dataChannel, anchorTextHeaderViewModel, z, j, str3, str4, z4, i3, awS610S0100000_312, awS575S0100000_313, awS575S0100000_314, z5);
    }
}
