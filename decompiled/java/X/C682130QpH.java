package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682130QpH extends AbstractC682140QpI {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC682150QpJ interfaceC682150QpJ = (InterfaceC682150QpJ) xBaseParamModel;
        try {
            C1227904rF.LIZ.getClass();
            String strLJIILL = C1227904rF.LIZLLL().LJIILL(interfaceC682150QpJ.getMusic());
            String rank = interfaceC682150QpJ.getRank();
            String type = interfaceC682150QpJ.getType();
            String str = "music";
            if (!Intrinsics.LJFF(type, "music")) {
                if (!Intrinsics.LJFF(type, "video")) {
                    str = "";
                } else {
                    str = "music_with_video";
                }
            }
            if (C123100dR.LIZ(strLJIILL)) {
                try {
                    Music music = (Music) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), strLJIILL, new TypeToken<Music>() { // from class: X.0QpK
                    }.getType());
                    if (music != null) {
                        MusicModel musicModelConvertToMusicModel = music.convertToMusicModel();
                        if (Intrinsics.LJFF(str, "music_with_video")) {
                            musicModelConvertToMusicModel.setCardType(MusicModel.CardType.AWESearchMusicCardMusicWithVideo);
                        }
                        C1440005kM.LIZ(new C681160Qni(musicModelConvertToMusicModel, rank, str));
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC682170QpL.class, containerID), "");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handle jsb with exception: ");
            sbLIZ.append(e2.getMessage());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
