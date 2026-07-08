package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.Unit;
import webcast.api.anchor_tool.EffectBeautySuggestionResponse;

/* JADX INFO: renamed from: X.01yr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC510701yr {
    Object LIZ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    Object LIZIZ(InterfaceC1364105Vn<? super List<C0U74<LiveEffect>>> interfaceC1364105Vn);

    List<C0U74<LiveEffect>> LIZJ();

    Object LIZLLL();

    Object LJ(Bitmap bitmap, InterfaceC1364105Vn<? super CoverImageModel> interfaceC1364105Vn);

    List<String> LJFF();

    Unit LJII(List list);

    Object LJIIIIZZ(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C771050UMl<? extends Throwable, ? extends EffectBeautySuggestionResponse.ResponseData>> interfaceC1364105Vn);

    LiveEffect LJIIJ(long j);

    void LJIIJJI(LiveEffect liveEffect);
}
