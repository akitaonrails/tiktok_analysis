package X;

import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1370990lmT extends C2217421BqW implements Function1<String, Boolean> {
    public C1370990lmT(Object obj) {
        super(1, obj, AwemeSharePackage.class, "shareUrlIsLegal", "shareUrlIsLegal(Ljava/lang/String;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        this.receiver.getClass();
        return Boolean.valueOf(SharePackage.LJIL(str));
    }
}
