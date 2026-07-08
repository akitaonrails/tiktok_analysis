package X;

import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;

/* JADX INFO: renamed from: X.0o7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461000o7e {
    public static final C0LAB LIZ(AVETParameter aVETParameter) {
        String creationId;
        String shootWay;
        String contentSource;
        String contentType;
        C0LAB c0lab = new C0LAB();
        String str = "";
        if (aVETParameter == null || (creationId = aVETParameter.getCreationId()) == null) {
            creationId = "";
        }
        c0lab.LJ("creation_id", creationId);
        if (aVETParameter == null || (shootWay = aVETParameter.getShootWay()) == null) {
            shootWay = "";
        }
        c0lab.LJ("shoot_way", shootWay);
        if (aVETParameter == null || (contentSource = aVETParameter.getContentSource()) == null) {
            contentSource = "";
        }
        c0lab.LJ("content_source", contentSource);
        if (aVETParameter != null && (contentType = aVETParameter.getContentType()) != null) {
            str = contentType;
        }
        c0lab.LJ("content_type", str);
        c0lab.LJ("placeholder_enter_from", "video_edit_page");
        return c0lab;
    }
}
