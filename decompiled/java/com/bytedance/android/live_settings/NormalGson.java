package com.bytedance.android.live_settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2188811AlT;
import com.bytedance.android.live_settings.gson.SettingTypeAdapterFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.o;

/* JADX INFO: loaded from: classes4.dex */
public class NormalGson {
    public static Gson gsonOpt;

    /* JADX INFO: renamed from: com.bytedance.android.live_settings.NormalGson$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[C09D6.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                try {
                } catch (NoSuchFieldError e) {
                    e = e;
                }
            } catch (NoSuchFieldError e2) {
                e = e2;
            }
            try {
                iArr[C09D6.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                try {
                    try {
                    } catch (NoSuchFieldError e4) {
                        e = e4;
                    }
                } catch (NoSuchFieldError e5) {
                    e = e5;
                }
            } catch (NoSuchFieldError e6) {
                e = e6;
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[C09D6.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
                e = e7;
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static synchronized Gson singleton() {
        Gson gson = gsonOpt;
        if (gson != null) {
            return gson;
        }
        e eVar = new e();
        eVar.LJIIL = false;
        AnonymousClass1 anonymousClass1 = null;
        eVar.LIZJ(new BooleanTypeAdapter(anonymousClass1), Boolean.class);
        eVar.LIZJ(new BooleanTypeAdapter(anonymousClass1), Boolean.TYPE);
        eVar.LIZLLL(new SettingTypeAdapterFactory());
        Gson gsonLIZ = eVar.LIZ();
        gsonOpt = gsonLIZ;
        return gsonLIZ;
    }

    public static class BooleanTypeAdapter extends TypeAdapter<Boolean> {
        public BooleanTypeAdapter() {
        }

        public /* synthetic */ BooleanTypeAdapter(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Boolean read(C09CU c09cu) {
            C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
            int i = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[c09d6LJJLIIIJ.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    if (c09cu.LJJIZ() == 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Expected BOOLEAN or NUMBER but was ");
                sbLIZ.append(c09d6LJJLIIIJ);
                throw new o(C2188811AlT.LIZIZ(sbLIZ));
            }
            return Boolean.valueOf(c09cu.LJJ());
        }

        @Override // com.google.gson.TypeAdapter
        public void write(C09DL c09dl, Boolean bool) {
            if (bool == null) {
                c09dl.LJIJJ();
            } else {
                c09dl.LJJJ(bool);
            }
        }
    }
}
