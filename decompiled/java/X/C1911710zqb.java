package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.edit.EditMusicStruct;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;

/* JADX INFO: renamed from: X.0zqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911710zqb extends AbstractC2383609Vq {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC2383709Vr interfaceC2383709Vr = (InterfaceC2383709Vr) xBaseParamModel;
        String itemID = interfaceC2383709Vr.getItemID();
        String musicID = interfaceC2383709Vr.getMusicID();
        String preMusicID = interfaceC2383709Vr.getPreMusicID();
        EditMusicStruct editMusicStruct = new EditMusicStruct();
        editMusicStruct.setMusicID(musicID);
        editMusicStruct.setMusicVolume("50");
        ReplaceMusicRequest replaceMusicRequest = new ReplaceMusicRequest();
        replaceMusicRequest.setItemID(itemID);
        replaceMusicRequest.setEditMusicStruct(editMusicStruct);
        replaceMusicRequest.setVoiceVolume(50);
        PromoteReplaceMusicRequest promoteReplaceMusicRequest = new PromoteReplaceMusicRequest();
        promoteReplaceMusicRequest.setOriginalMusicID(preMusicID);
        promoteReplaceMusicRequest.setItemID(itemID);
        promoteReplaceMusicRequest.setReplaceMusicRequest(replaceMusicRequest);
        promoteReplaceMusicRequest.setRequestFrom("from_jsb");
        ((IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class)).replaceDirectInPromoteScene(promoteReplaceMusicRequest).LIZLLL(new C2501509rB(completionBlock, 18));
    }
}
