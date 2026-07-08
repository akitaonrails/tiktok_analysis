package X;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0sLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623650sLz {
    public static final EffectCategoryModel LIZ(Function1<? super EffectCategoryModel, Unit> function1) {
        EffectCategoryModel effectCategoryModel = new EffectCategoryModel((String) null, (String) null, (String) null, (UrlModel) null, (UrlModel) null, (List) null, (List) null, (String) null, false, (String) null, 1023, (DefaultConstructorMarker) null);
        function1.invoke(effectCategoryModel);
        return effectCategoryModel;
    }
}
