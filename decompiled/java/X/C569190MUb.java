package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNodeSrcInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.util.Collections;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569190MUb extends AbstractC2255721DQs<C18WV> implements C18WV, InterfaceC379610EuV {
    public static final C569200MUc LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final AbstractC214814194y LL;
    public final C1DRG LLILLJJLI;
    public final C18WV LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final C18UJ LLILZIL = (C18UJ) getDiContainer().LJII(C18UJ.class, null);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0MUc] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C569190MUb.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new Object() { // from class: X.0MUc
        };
        LLIZLLLIL = 8;
    }

    private final C19EG X1() {
        return (C19EG) this.LLILZ.getValue(this, LLIZ[0]);
    }

    public final void exit() {
        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(this.LL);
        if (abstractC214814194yLIZ != null) {
            abstractC214814194yLIZ.finish();
            return;
        }
        Activity activity = this.LL.mActivity;
        if (activity != null) {
            activity.finish();
        }
    }

    public C18WV W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.C18WV
    public void eV(boolean z) {
        if (z) {
            exit();
        } else {
            if (C21292718Uj.LIZ(X1(), this.LLILZIL, "leave", new AwS552S0100000_8(this, 801), null, 48)) {
                return;
            }
            exit();
        }
    }

    @Override // X.C18WV
    public void rE0(AIChatGenNode aIChatGenNode) {
        String path;
        IExternalService iExternalService;
        IOpenPhotoNextService iOpenPhotoNextServiceOpenGotoNextService;
        this.LLILZIL.LJ.postAIChatGenNode = aIChatGenNode;
        AIChatGenNodeSrcInfo srcInfo = aIChatGenNode.getSrcInfo();
        if (srcInfo != null && (path = srcInfo.getPath()) != null && (iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) != null && (iOpenPhotoNextServiceOpenGotoNextService = iExternalService.openGotoNextService()) != null) {
            iOpenPhotoNextServiceOpenGotoNextService.openEditPageForImages((C19EG) getDiContainer().LJII(C19EG.class, null), Z1(this.LLILZIL.LJ, aIChatGenNode), Collections.singletonList(path));
        }
    }

    @Override // X.C18WV
    public void zw2(AIChatGenNode aIChatGenNode) {
        AbstractC214814194y abstractC214814194y = this.LL;
        Intent intent = new Intent();
        intent.putExtra("key_ai_chat_gen_node", (Parcelable) aIChatGenNode);
        intent.putExtra("key_ai_chat_gen_model", this.LLILZIL.LJ);
        abstractC214814194y.setResult(-1, intent);
        this.LL.finish();
    }

    public C569190MUb(AbstractC214814194y abstractC214814194y, C1DRG c1drg) {
        this.LL = abstractC214814194y;
        this.LLILLJJLI = c1drg;
    }

    private final Bundle Z1(AIChatGenModel aIChatGenModel, AIChatGenNode aIChatGenNode) {
        String str;
        String str2;
        String str3;
        Bundle bundle = new Bundle();
        C0MUK.LJIIJ(bundle, new CreativeModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 2097151, null));
        AIChatGenChatRoomModel aIChatGenChatRoomModel = this.LLILZIL.LJ.chatRoomModel;
        if (aIChatGenChatRoomModel != null && (str3 = aIChatGenChatRoomModel.enterFrom) != null) {
            C0MUK.LIZJ(bundle).eventData.enterFrom = str3;
            C786410Ut5.LJJJI("shoot_enter_from", str3, bundle);
            C786410Ut5.LJJJI("enter_from", str3, bundle);
        }
        AIChatGenChatRoomModel aIChatGenChatRoomModel2 = this.LLILZIL.LJ.chatRoomModel;
        if (aIChatGenChatRoomModel2 != null && (str2 = aIChatGenChatRoomModel2.enterMethod) != null) {
            C0MUK.LIZJ(bundle).eventData.shootEnterMethod = str2;
            C786410Ut5.LJJJI("shoot_enter_method", str2, bundle);
        }
        C0MUK.LIZJ(bundle).aiChatGenModel = aIChatGenModel;
        o2(bundle, aIChatGenNode);
        AIChatGenChatRoomModel aIChatGenChatRoomModel3 = aIChatGenModel.chatRoomModel;
        if (aIChatGenChatRoomModel3 == null || (str = aIChatGenChatRoomModel3.creationId) == null) {
            str = "";
        }
        String str4 = null;
        C537520L6g.LIZJ(0, str, null, bundle);
        AIChatGenChatRoomModel aIChatGenChatRoomModel4 = this.LLILZIL.LJ.chatRoomModel;
        if (aIChatGenChatRoomModel4 != null) {
            str4 = aIChatGenChatRoomModel4.shootWay;
        }
        C786410Ut5.LJJJI("shoot_way", str4, bundle);
        if (Intrinsics.LJFF(this.LLILZIL.LJII.scene, "default_landing_create_tab")) {
            C0MUK.LIZJ(bundle).landingModel.defaultLandingCreateTab = true;
        }
        return bundle;
    }

    private final void o2(Bundle bundle, AIChatGenNode aIChatGenNode) {
        AIChatGenNodeSrcInfo srcInfo;
        if (aIChatGenNode != null && (srcInfo = aIChatGenNode.getSrcInfo()) != null) {
            C0MUK.LIZJ(bundle).editModel.editPreviewInfo = new C538330L9j(srcInfo.getWidth(), srcInfo.getHeight(), 12).LIZ(new EditVideoSegment(srcInfo.getPath(), null, new VideoFileInfo(srcInfo.getWidth(), srcInfo.getHeight(), 0L, 30, 0, 0, 0, 0, 0.0f, 496, null), 2, null));
            MediaModel mediaModel = new MediaModel(-1L);
            mediaModel.LJIILL(srcInfo.getPath());
            mediaModel.width = srcInfo.getWidth();
            mediaModel.height = srcInfo.getHeight();
            C786410Ut5.LJJIL(bundle, "extra_image_model_media_list", C1697810uHb.LJ(mediaModel));
        }
    }
}
