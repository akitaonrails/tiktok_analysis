package X;

/* JADX WARN: Method from annotation default annotation not found: dependencies */
/* JADX INFO: renamed from: X.1BCD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public @interface C1BCD {
    C1BC9 dependencyRes() default C1BC9.None;

    long distinctId() default -1;

    C1BCK ensureTiming() default @C1BCK(phase = "", scenario = "");

    C1BCJ scenario() default @C1BCJ(parent = "", scenario = "");

    Class<?>[] strategyArray() default {};

    String taskGroup() default "";

    EnumC800170VaB threadType() default EnumC800170VaB.IO;

    C1BCK triggerTiming() default @C1BCK(phase = "", scenario = "");

    EnumC1781560wSg type();
}
