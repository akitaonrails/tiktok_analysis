package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0uUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1705790uUT<T> extends AbstractC1705830uUX<T> {
    public abstract T LJ(CategoryPageModel categoryPageModel);

    static {
        new AbstractC1705790uUT<CategoryPageModel>() { // from class: X.0uUW
            @Override // X.AbstractC1705790uUT
            public final CategoryPageModel LJ(CategoryPageModel categoryPageModel) {
                if (categoryPageModel == null) {
                    return new CategoryPageModel(null, new ArrayList(), null);
                }
                return categoryPageModel;
            }
        };
    }
}
