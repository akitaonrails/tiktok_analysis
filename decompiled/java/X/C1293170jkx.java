package X;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: X.0jkx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293170jkx {
    public static C1293120jks LIZ(JsonReader jsonReader, C1291600jiQ c1291600jiQ) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C1293190jkz(c1291600jiQ, C1293210jl1.LIZ(jsonReader, c1291600jiQ, C1293420jlM.LIZLLL(), new InterfaceC1293670jll<PointF>() { // from class: X.0jle
                    @Override // X.InterfaceC1293670jll
                    public final PointF LIZ(JsonReader jsonReader2, float f) {
                        return C1293250jl5.LIZIZ(jsonReader2, f);
                    }
                }, z)));
            }
            jsonReader.endArray();
            C1293180jky.LIZIZ(arrayList);
        } else {
            arrayList.add(new C1293200jl0(C1293250jl5.LIZIZ(jsonReader, C1293420jlM.LIZLLL())));
        }
        return new C1293120jks(arrayList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static InterfaceC1293620jlg<PointF, PointF> LIZIZ(JsonReader jsonReader, C1291600jiQ c1291600jiQ) throws IOException {
        jsonReader.beginObject();
        C1293120jks c1293120jksLIZ = null;
        final C1292960jkc c1292960jkcLIZ = null;
        final C1292960jkc c1292960jkcLIZ2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName.hashCode()) {
                case 107:
                    if (!strNextName.equals("k")) {
                        jsonReader.skipValue();
                    } else {
                        c1293120jksLIZ = LIZ(jsonReader, c1291600jiQ);
                    }
                    break;
                case 120:
                    if (!strNextName.equals("x")) {
                        jsonReader.skipValue();
                    } else if (jsonReader.peek() == JsonToken.STRING) {
                        jsonReader.skipValue();
                        z = true;
                    } else {
                        c1292960jkcLIZ = C1293150jkv.LIZ(jsonReader, c1291600jiQ, true);
                    }
                    break;
                case 121:
                    if (!strNextName.equals("y")) {
                        jsonReader.skipValue();
                    } else if (jsonReader.peek() == JsonToken.STRING) {
                        jsonReader.skipValue();
                        z = true;
                    } else {
                        c1292960jkcLIZ2 = C1293150jkv.LIZ(jsonReader, c1291600jiQ, true);
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            c1291600jiQ.LIZ("Lottie doesn't support expressions.");
        }
        if (c1293120jksLIZ != null) {
            return c1293120jksLIZ;
        }
        return new InterfaceC1293620jlg<PointF, PointF>(c1292960jkcLIZ, c1292960jkcLIZ2) { // from class: X.0jl8
            public final C1292960jkc LIZ;
            public final C1292960jkc LIZIZ;

            @Override // X.InterfaceC1293620jlg
            public final AbstractC1293310jlB<PointF, PointF> LIZ() {
                final C1293040jkk c1293040jkk = (C1293040jkk) this.LIZ.LIZ();
                final C1293040jkk c1293040jkk2 = (C1293040jkk) this.LIZIZ.LIZ();
                return new AbstractC1293310jlB<PointF, PointF>(c1293040jkk, c1293040jkk2) { // from class: X.0jl9
                    public final PointF LJI;
                    public final AbstractC1293310jlB<Float, Float> LJII;
                    public final AbstractC1293310jlB<Float, Float> LJIIIIZZ;

                    @Override // X.AbstractC1293310jlB
                    public final PointF LJ() {
                        return this.LJI;
                    }

                    @Override // X.AbstractC1293310jlB
                    public final void LJII(float f) {
                        this.LJII.LJII(f);
                        this.LJIIIIZZ.LJII(f);
                        this.LJI.set(this.LJII.LJ().floatValue(), this.LJIIIIZZ.LJ().floatValue());
                        for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
                            ((InterfaceC1293690jln) ListProtector.get(this.LIZ, i)).LIZJ();
                        }
                    }

                    {
                        super(Collections.emptyList());
                        this.LJI = new PointF();
                        this.LJII = c1293040jkk;
                        this.LJIIIIZZ = c1293040jkk2;
                        LJII(this.LIZLLL);
                    }

                    @Override // X.AbstractC1293310jlB
                    public final PointF LJFF(C1293200jl0<PointF> c1293200jl0, float f) {
                        return this.LJI;
                    }
                };
            }

            {
                this.LIZ = c1292960jkcLIZ;
                this.LIZIZ = c1292960jkcLIZ2;
            }
        };
    }
}
