package X;

import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;

/* JADX INFO: renamed from: X.0ZGM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZGM {
    public static final C0ZGR LIZ(FeatureAttachmentData featureAttachmentData) {
        C2243521CrW c2243521CrWLIZ;
        C0ZGN c0zgn = new C0ZGN();
        c0zgn.LIZLLL = featureAttachmentData.type.toProto();
        c0zgn.LJ = featureAttachmentData.id;
        c0zgn.LJFF = Long.valueOf(featureAttachmentData.uid);
        c0zgn.LJI = Long.valueOf(featureAttachmentData.originalCreateTime);
        TextComponent textComponent = featureAttachmentData.content;
        if (textComponent != null) {
            c2243521CrWLIZ = textComponent.LIZ();
        } else {
            c2243521CrWLIZ = null;
        }
        c0zgn.LJII = c2243521CrWLIZ;
        return c0zgn.build();
    }
}
