package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397880mTq extends C09AY implements Function0<LruCache<String, IMUser>> {
    public C1397880mTq() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final LruCache<String, IMUser> invoke() {
        return new LruCache<>(LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
