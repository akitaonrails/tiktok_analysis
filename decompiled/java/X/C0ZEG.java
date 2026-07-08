package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZEG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public interface C0ZEG {
    boolean LJJIZ(String str, RelationButton relationButton, String str2, Map map, String str3, User user, String str4, boolean z, AttachmentComponent attachmentComponent, Integer num, Serializable serializable, LifecycleOwner lifecycleOwner, Function0 function0);

    boolean LJJJJLI(String str, String str2, String str3, String str4, String str5);

    void LJJJJLL(String str, String str2, Context context, boolean z, String str3, Map<String, String> map, View view);

    boolean LJJLIIIIJ();

    String LJJLIIIJJI(String str);

    boolean LJJLIIIJJIZ();
}
