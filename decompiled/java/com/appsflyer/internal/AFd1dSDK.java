package com.appsflyer.internal;

import X.C09AY;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class AFd1dSDK {

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1dSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends C09AY implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass5 AFInAppEventParameterName = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            return "at ".concat(String.valueOf(stackTraceElement));
        }
    }

    public static final List<StackTraceElement> values(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (u.LJJIIJZLJL(stackTraceElement.getClassName(), "com.appsflyer", false)) {
                arrayList.add(stackTraceElement);
            }
        }
        return arrayList;
    }
}
