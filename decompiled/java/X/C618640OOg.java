package X;

import com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePlayedStore;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618640OOg extends C09AY implements Function1<BulletinVoicePlayedStore.Entry, Boolean> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C618640OOg(String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(BulletinVoicePlayedStore.Entry entry) {
        boolean z;
        BulletinVoicePlayedStore.Entry entry2 = entry;
        if (!Intrinsics.LJFF(entry2.sourceId, this.LL) && !Intrinsics.LJFF(entry2.sourceId, this.LLILLJJLI)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
