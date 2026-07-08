package X;

import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.14EU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public @interface C14EU {
    int priority() default 0;

    boolean sticky() default false;

    ThreadMode threadMode() default ThreadMode.POSTING;
}
