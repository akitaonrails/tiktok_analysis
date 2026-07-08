package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15zR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20700715zR extends C09AY implements Function1<ContentLanguage, CharSequence> {
    public C20700715zR() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(ContentLanguage contentLanguage) {
        return contentLanguage.getLanguageCode();
    }
}
