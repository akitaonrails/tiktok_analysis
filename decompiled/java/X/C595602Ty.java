package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C595602Ty extends Message<C595602Ty, C595702Tz> {
    public static final ProtoAdapter<C595602Ty> ADAPTER = new ProtoAdapter<C595602Ty>() { // from class: X.02Tx
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C595602Ty decode(ProtoReader protoReader) {
            C595602Ty c595602Ty = new C595602Ty();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c595602Ty.extra_track_param.putAll(this.LIZ.decode(protoReader));
                            }
                        } else {
                            c595602Ty.render_time = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c595602Ty.main_track_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c595602Ty;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C595602Ty c595602Ty) {
            C595602Ty c595602Ty2 = c595602Ty;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c595602Ty2.main_track_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c595602Ty2.render_time) + this.LIZ.encodedSizeWithTag(3, c595602Ty2.extra_track_param) + c595602Ty2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C595602Ty c595602Ty) {
        }
    };
    public Map<String, String> extra_track_param;
    public String main_track_id;
    public Integer render_time;

    @Override // com.squareup.wire.Message
    public C595702Tz newBuilder() {
        return null;
    }

    public C595602Ty() {
        super(ADAPTER, ByteString.EMPTY);
        this.extra_track_param = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
