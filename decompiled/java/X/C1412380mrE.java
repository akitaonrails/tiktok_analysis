package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.TemplateAnchorData;

/* JADX INFO: renamed from: X.0mrE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412380mrE {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0182, code lost:
    
        if (r1.equals("edit_page") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x018b, code lost:
    
        if (r1.equals("edit_page_photo") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0194, code lost:
    
        if (r1.equals("preview_page") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x019d, code lost:
    
        if (r1.equals("video_edit_page") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01a0, code lost:
    
        r0 = X.C1412390mrF.LJIILJJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01a9, code lost:
    
        if (r1.equals("upload_page") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ac, code lost:
    
        r0 = X.C1412390mrF.LJIILIIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01ae, code lost:
    
        if (r0 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01b0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ec, code lost:
    
        if (r1 == com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType.SOUND_SYNC) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x013d, code lost:
    
        if (r1 == com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType.SOUND_SYNC) goto L99;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1412390mrF LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1412380mrE.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):X.0mrF");
    }

    public static final boolean LIZIZ(CreativeModel creativeModel) {
        TemplateAnchorData templateAnchorData = creativeModel.templateAnchorData;
        if (templateAnchorData.isFollowPublishFromAnchor) {
            if (templateAnchorData.ttTemplateType != null || templateAnchorData.followedTemplateDispatchType != null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
