package X;

import java.security.SecureRandom;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670930QTj extends C09AY implements Function0<Boolean> {
    public C670930QTj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C2187451AjH.LJIIJ() || new SecureRandom().nextFloat() < 0.05f);
    }
}
