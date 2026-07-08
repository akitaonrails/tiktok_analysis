package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C590802Sc extends Message<C590802Sc, C590902Sd> {
    public static final ProtoAdapter<C590802Sc> ADAPTER = new ProtoAdapter<C590802Sc>() { // from class: X.02Sb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C590802Sc decode(ProtoReader protoReader) {
            C590802Sc c590802Sc = new C590802Sc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c590802Sc.scene_value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c590802Sc.scene_key = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c590802Sc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C590802Sc c590802Sc) {
            C590802Sc c590802Sc2 = c590802Sc;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c590802Sc2.scene_key) + ProtoAdapter.STRING.encodedSizeWithTag(2, c590802Sc2.scene_value) + c590802Sc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C590802Sc c590802Sc) {
        }
    };
    public Integer scene_key;
    public String scene_value;

    public C590802Sc() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C590902Sd newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
