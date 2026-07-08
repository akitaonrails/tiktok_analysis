package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0qQL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public @interface InterfaceC1549470qQL {
    InterfaceC1549510qQP defaultValue() default @InterfaceC1549510qQP;

    boolean isEnum() default false;

    boolean isGetter() default true;

    String keyPath() default "";

    Class<? extends XBaseModel> nestedClassType() default C1467105oj.class;

    Class<? extends Object> primitiveClassType() default Object.class;

    boolean required() default false;
}
