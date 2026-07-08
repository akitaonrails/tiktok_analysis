package X;

import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Oms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629680Oms implements C0NBA {
    public final /* synthetic */ Map<String, Object> LIZ;
    public final /* synthetic */ boolean LIZIZ;

    public C629680Oms(Map<String, ? extends Object> map, boolean z) {
        this.LIZ = map;
        this.LIZIZ = z;
    }

    @Override // X.C0NBA
    public final void LIZ(C0NBB c0nbb) throws JSONException {
        String str;
        Map<String, ? extends Object> map = this.LIZ;
        boolean z = this.LIZIZ;
        c0nbb.LIZIZ(map);
        if (z) {
            str = "favourite_song_first";
        } else {
            str = "favourite_song";
        }
        c0nbb.LIZ("toast_type", str);
    }
}
