package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: X.0ldB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1365230ldB {
    AttachmentComponent LIZJ(Aweme aweme, User user, C0IB7 c0ib7);

    BaseContent.ReferenceVideo LIZLLL(Aweme aweme);

    Map<String, String> LJ(Long l, Long l2, AttachmentComponent attachmentComponent, String str);

    AttachmentComponent LJFF(Serializable serializable, C0IB7 c0ib7);

    Map<String, String> LJIIIIZZ(SetSticker setSticker, AttachmentComponent attachmentComponent, String str);

    AttachmentTypeComponent LJIIL(C0IB7 c0ib7);

    AttachmentComponent LJJIJ(String str, Integer num, String str2, String str3, AttachmentTypeComponent attachmentTypeComponent, boolean z, FallbackStatusComponent fallbackStatusComponent, Long l);

    BaseContent.ReferenceVideo LJJIJIIJIL(boolean z, Integer num, String str, String str2, String str3, FallbackStatusComponent fallbackStatusComponent, Long l);

    PreviewHintComponent LJJIJIL(long j, long j2, AttachmentTypeComponent attachmentTypeComponent, String str, boolean z, Context context);
}
