package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;

/* JADX INFO: renamed from: X.0Z2Z, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z2Z {
    public static final <Template extends BaseTemplate> Template LIZ(C869590Y9l c869590Y9l, Class<Template> cls) {
        Object localCache = c869590Y9l.getLocalCache(501);
        if (cls.isInstance(localCache)) {
            return cls.cast(localCache);
        }
        BaseTemplate baseTemplateLIZJ = C2241931Cox.LIZJ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZJ != null) {
            c869590Y9l.putLocalCache(501, baseTemplateLIZJ);
        } else {
            baseTemplateLIZJ = null;
        }
        if (!cls.isInstance(baseTemplateLIZJ)) {
            return null;
        }
        return cls.cast(baseTemplateLIZJ);
    }
}
