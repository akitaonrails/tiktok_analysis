package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStoryAnchorStruct;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.composer.model.ExternalContentShareStoryInputData;
import com.ss.android.ugc.aweme.composer.model.LinkShareData;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkAnchorModel;
import com.ss.ugc.aweme.creation.base.BasicModel;
import com.ss.ugc.aweme.creation.base.TrackModel;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MOR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MOR {
    public final CreationConfigModelCompat LIZ;

    public C0MOR(CreationConfigModelCompat creationConfigModelCompat) {
        this.LIZ = creationConfigModelCompat;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Context r12, X.InterfaceC1364105Vn r13) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MOR.LIZ(android.content.Context, X.05Vn):java.lang.Object");
    }

    public final Intent LIZIZ(CreativeInfo creativeInfo, CanvasVideoData canvasVideoData, AttributionLinkStoryAnchorStruct attributionLinkStoryAnchorStruct) {
        String shootWay;
        TrackModel track;
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, C0MUK.LJIIIIZZ());
        Workspace workspaceLIZ = C14D2.LIZ(creativeInfo);
        C0MUK.LIZIZ(intent).musicBuzModel.needAddRecent = true;
        intent.putExtra("creation_id", creativeInfo.getCreationId());
        BasicModel basic = this.LIZ.getBasic();
        if (basic != null && (track = basic.getTrack()) != null) {
            shootWay = track.getShootWay();
        } else {
            shootWay = null;
        }
        intent.putExtra("shoot_way", shootWay);
        C0MUK.LIZIZ(intent).canvasVideoData = canvasVideoData;
        C0MUK.LIZIZ(intent).workspace = workspaceLIZ;
        intent.putExtra("workspace", workspaceLIZ);
        LinkShareData linkShare = this.LIZ.getLinkShare();
        if (linkShare != null) {
            intent.putExtra("extra_share_context", linkShare.getShareContext());
        }
        CompileConfigResolution compileConfigResolution = new CompileConfigResolution(1080, 1920, null, null, 12, null);
        CompileConfigResolution compileConfigResolution2 = new CompileConfigResolution(compileConfigResolution.width, compileConfigResolution.height, null, null, 12, null);
        int i = compileConfigResolution2.width;
        int i2 = compileConfigResolution2.height;
        C577660MlA.LIZ.getClass();
        VideoFileInfo videoFileInfo = new VideoFileInfo(i, i2, C577660MlA.LIZ().defaultDuration, 30, 0, 0, 0, 0, 0.0f, 496, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0MPK.LIZ(creativeInfo));
        sbLIZ.append(C0MPK.LIZJ(".mp4"));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C570490MZb.LJI(new C0VSJ(strLIZIZ));
        C0MUK.LIZIZ(intent).editModel.editPreviewInfo = new C538330L9j(compileConfigResolution2.width, compileConfigResolution2.height, 12).LIZ(new EditVideoSegment(strLIZIZ, null, videoFileInfo));
        List<LinkAnchorModel> list = C0MUK.LIZIZ(intent).stickerModel.linkStoryAnchorModels;
        String fullURL = attributionLinkStoryAnchorStruct.getFullURL();
        String str = "";
        if (fullURL == null) {
            fullURL = "";
        }
        String displayText = attributionLinkStoryAnchorStruct.getDisplayText();
        if (displayText == null) {
            displayText = "";
        }
        String title = attributionLinkStoryAnchorStruct.getTitle();
        if (title != null) {
            str = title;
        }
        list.add(new LinkAnchorModel(new BaseStickerModel(0, 0, EnumC1466150oFx.LINK_ANCHOR, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), fullURL, displayText, str));
        return intent;
    }

    public final Object LIZJ(Context context, ExternalContentShareStoryInputData externalContentShareStoryInputData, final CreativeInfo creativeInfo, C0L4H c0l4h) {
        Uri uriFromFile;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c0l4h));
        c2252611DEt.LJIJJ();
        String contentUri = externalContentShareStoryInputData.getContentUri();
        if (contentUri != null) {
            if (!u.LJJIIJZLJL(contentUri, "content://", false) && !u.LJJIIJZLJL(contentUri, "file://", false)) {
                uriFromFile = Uri.fromFile(new C0VSJ(contentUri));
            } else {
                uriFromFile = UriProtector.parse(contentUri);
            }
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uriFromFile);
            c1331670kl3LJI.LJJIJL(context);
            c1331670kl3LJI.LIZLLL(C13LE.LIZ(C0MOR.class).LJI());
            c1331670kl3LJI.LJJII(new AbstractC468201s0() { // from class: X.0MOO
                /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
                @Override // X.InterfaceC1331910klR
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(android.graphics.Bitmap r37) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 494
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0MOO.LIZ(android.graphics.Bitmap):void");
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    String message;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Loading image failed: ");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C201955140j.LJFF("StoryLinkShareParser", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC20236714Gf<CanvasVideoData> interfaceC20236714Gf = c2252611DEt;
                    if (th == null) {
                        th = new RuntimeException("Loading shared image failed");
                    }
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                }
            });
        } else {
            C098200Yq c098200Yq = new C098200Yq(new RuntimeException("Image path is not provided"));
            C189200o6.m2constructorimpl(c098200Yq);
            c2252611DEt.resumeWith(c098200Yq);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c0l4h);
        }
        return objLJIJ;
    }
}
