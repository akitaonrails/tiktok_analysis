package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.utils.SearchViewLifecycleOwnerKt$doOnDestroy$1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01a4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C357001a4 {
    public static final void LIZ(LifecycleOwner lifecycleOwner, Function0 function0) {
        lifecycleOwner.getLifecycle().addObserver(new SearchViewLifecycleOwnerKt$doOnDestroy$1(function0));
    }
}
